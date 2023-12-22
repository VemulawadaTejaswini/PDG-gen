import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		for(int i=1,temp = fact;i<temp;i++){
			fact *= i;
		}
		System.out.println(fact);
    }
}