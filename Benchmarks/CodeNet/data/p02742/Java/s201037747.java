import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        long n3 = n1 * n2;
        long ans = 0;
        if(n1 == 1 || n2 == 1){
            ans = 1;
        }else if(n3 % 2 == 0){
        	ans = n3 / 2;
        }else{
        	ans = (n3 / 2) + 1;
        }
        System.out.println(ans);
    }
}