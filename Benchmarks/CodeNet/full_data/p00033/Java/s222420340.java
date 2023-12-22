import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void aa(){
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String YN="YES";
			int r=sc.nextInt();
			int l=0;
			for(int j=0;j<9;j++){
				int ball=sc.nextInt();
				if(ball>r)r=ball;
				else if(ball>l)l=ball;
				else YN="NO";
			}
			System.out.println(YN);
		}
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}