import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans1=b-a;
		if(ans1<0)ans1=Integer.MAX_VALUE;
		int ans2=1+(b+a);
		if(ans2<1)ans2=Integer.MAX_VALUE;
		int ans3=1+(-b-a);
		if(ans3<1)ans3=Integer.MAX_VALUE;
		int ans4=2+(-b+a);
		if(ans4<2)ans4=Integer.MAX_VALUE;
		int ans=Math.min(ans1, ans2);
		ans=Math.min(ans,ans3);
		ans=Math.min(ans,ans4);
		System.out.println(ans);
		
			
			
			
		
		}
		
	}



