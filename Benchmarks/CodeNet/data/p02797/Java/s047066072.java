import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),s=sc.nextInt();
		sc.close();
		for(int i=0;i<k;i++) System.out.print(s+" ");
		for(int i=k;i<n;i++) System.out.print(1+" ");
	}
}