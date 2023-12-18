import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        long n3 = n1 * n2;
        if(n3 % 2 == 0){
        	System.out.println(n3 / 2);
        }else{
        	System.out.println((n3 / 2) + 1);
        }
    }
}