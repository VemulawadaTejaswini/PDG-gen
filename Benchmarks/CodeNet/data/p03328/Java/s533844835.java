import java.util.Scanner;
 
class Main{
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = b -a ;
		int sum = 0;
		int ans = 0;
		for(int i=0;i < n;i++){
			sum += i;
		}
		ans = sum -a;
		System.out.println(ans);
	}
 
 
 
 
 
 
 
 
 
}
 