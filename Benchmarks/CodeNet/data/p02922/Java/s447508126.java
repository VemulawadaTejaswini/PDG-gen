import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int n = (B-A)/(A-1)+1;

    if(n<=0){
 		System.out.println("0");       
	}else if((B-A)%(A-1)==0){
		System.out.println(n);
	}else{
		System.out.println(n+1);	    
	}
}
}