import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int a=0;
		for(int i=A;i<=B;i++) {
			if(i/1000==i%10*10+i%100/10) {
				a=a+1;
			}
		}
		System.out.println(a);
	}
}