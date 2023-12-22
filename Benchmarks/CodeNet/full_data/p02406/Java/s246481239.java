import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x=0,y=-1;
		for (int a=1;a<=n;a++){
			if(x!=0&&x!=y){System.out.print(x+" ");y=x;}
			if(a%3!=0&&a%10!=3){continue;}
			x=a;
		}
		System.out.println(x);
	}
}