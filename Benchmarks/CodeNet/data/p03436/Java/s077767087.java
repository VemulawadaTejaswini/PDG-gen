import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int step=(H-1)*(W-1);
		int num_sharp=0;
		char[][] s=new char[H][W];


		for(int i=0;i<H;i++){
			//入力を文字列sに格納
			String str=sc.next();
			for(int j=0;j<W;j++) {
				s[i][j]=str.charAt(j);
				if(s[i][j]=='#') num_sharp++;;
			}
		}

		if(!Check_digit(1,1,H,W,s)) System.out.println("-1");
		else System.out.println(step - num_sharp);
	}
	static boolean Check_digit(int a, int b,int H,int W,char s[][]){
		boolean ans=true;
		if(s[a-1][b-1]=='#') ans=false;
		else if(a<H && b<W){
			Check_digit(a+1,b,H,W,s);
			Check_digit(a,b+1,H,W,s);
		}else if(a==H && b<W){
			Check_digit(a,b+1,H,W,s);
		}else if(a<H && b==W){
			Check_digit(a+1,b,H,W,s);
		}else if(a==H && b==W){
			ans=true;
		}
		return ans;
	}
}