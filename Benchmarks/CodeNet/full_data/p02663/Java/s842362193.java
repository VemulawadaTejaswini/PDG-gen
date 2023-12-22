import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt(),m1=sc.nextInt(),h2=sc.nextInt(),m2=sc.nextInt(),k=sc.nextInt();
		sc.close();
		int start =h1*60+m1,goal=h2*60+m2;
		System.out.println(goal-k-start);
	}
}