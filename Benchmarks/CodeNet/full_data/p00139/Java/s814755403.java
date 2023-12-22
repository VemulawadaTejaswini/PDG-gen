import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	
	int solve(String str)
	{
		final int HEAD=0;
		final int EYE_A=1;
		final int EYE_B=2;
		final int BODY_A1=3;
		final int BODY_A2=4;
		final int BODY_B=5;
		final int STOMACH_A=6;
		final int TAIL_A=7;
		final int TAIL_B=8;
		
		int state=-1;
		int count=0;
		for(int i=0;i<str.length();++i)
		{
			switch(str.charAt(i))
			{
			case '>':
				if(state==-1){state=HEAD;}
				else{return 2;}
				break;
			case '\'':
				if(state==HEAD){state=EYE_A;}
				else{return 2;}
				break;
			case '^':
				if(state==HEAD){state=EYE_B;}
				else{return 2;}
				break;
			case 'Q':
				if(state==EYE_B){state=BODY_B;}
				if(state!=BODY_B||str.charAt(++i)!='='){return 2;}
				break;
			case '=':
				if(state==EYE_A||state==BODY_A1){state=BODY_A1;++count;}
				else if(state==STOMACH_A||state==BODY_A2){state=BODY_A2;--count;}
				else{return 2;}
				break;
			case '#':
				if(state==BODY_A1){state=STOMACH_A;}
				else{return 2;}
				break;
			case '~':
				if(state==BODY_A2&&count==0){state=TAIL_A;}
				else if(state==BODY_B){state=TAIL_B;count=1;}
				else if(state==TAIL_B){++count;}
				else{return 2;}
			}
		}
		if(state==TAIL_B&&count!=2)return 2;

		return state==TAIL_A?0:1;
	}
	
	void io()
	{
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;++i)
		{
			String str=sc.next();
			switch(solve(str))
			{
			case 0:
				System.out.println('A');
				break;
			case 1:
				System.out.println('B');
				break;
			case 2:
				System.out.println("NA");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}