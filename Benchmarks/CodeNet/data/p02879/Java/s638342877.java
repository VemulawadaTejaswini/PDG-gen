import java.util.Scanner;

class main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans = 0;
		if((a > 0 && a < 10) && (b > 0 && b < 10)){
			ans = a * b;
		}else{
			ans = -1;
		}
		System.out.println(ans);
	}
}

