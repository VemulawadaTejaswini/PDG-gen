import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int k = n % 500;
		if (k == a){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}