import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		for(int i =1;(a=sc.nextInt())!=0;i++){
			System.out.println("Case "+i+": "+a);
		}
	}
}