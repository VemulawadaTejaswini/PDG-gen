import java.util.*;
import java.text.*;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - (b*2);
		if(c <= 0){
			System.out.println("0");
		}
		else{
			System.out.println(c);
		}
	}
}