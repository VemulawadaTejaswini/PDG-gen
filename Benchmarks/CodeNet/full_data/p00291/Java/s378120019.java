import java.util.Scanner;
 
class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		System.out.println((a*1+b*5+c*10+d*50+e*100+f*500)/1000);
	}
}