import java.util.*;
class Product{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		if ((a * b) % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
