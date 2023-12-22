import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N>=1000){
			N -= 1000;
		}
		System.out.println(N);
    }
}
