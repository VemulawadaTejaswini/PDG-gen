import java.util.Scanner;

//Distinct or Not
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
      	int adj = n % 2;
      	System.out.println(n/2 + adj);
    }
}