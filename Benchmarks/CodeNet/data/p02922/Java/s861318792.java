import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int n = B/A;

	if(B%A==0){
		System.out.println(n);
	}else{
		System.out.println(n+1);
	}
}
}