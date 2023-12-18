import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println(Math.min(Math.min((c-2*(c/2))*a*b,(b-2*(b/2))*a*c),(a-2*(a/2))*b*c));
		}
	}
}