import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i+=d*2+1)count++;
		System.out.println(count);
	}
}
