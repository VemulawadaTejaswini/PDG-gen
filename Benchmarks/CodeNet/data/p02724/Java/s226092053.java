import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println((a/500)*1000 + ((a%500)/5)*5);
	}
}
