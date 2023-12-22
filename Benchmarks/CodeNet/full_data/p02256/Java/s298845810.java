import java.util.Scanner;
public class Main{
	public static void calcu(int a,int b){
		int ans=b;
		int y=0;
		while(ans!=0){
			y=ans;
			ans=a%ans;
		}
		System.out.println(y);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>b)
			calcu(a,b);
		else
			calcu(b,a);
	}

}