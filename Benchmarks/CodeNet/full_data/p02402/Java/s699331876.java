import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),max=-1000001,min=1000001,non;long sum=0;
		for (int a=1;a<=n;a++){
			non=sc.nextInt();
		if (non>=max){max=non;}
		if(non<=min){min=non;}
		sum +=non;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}