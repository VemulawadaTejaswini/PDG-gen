import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        int n = 0;
        for (int i=0; i<N.length(); i++) {
            int num = Integer.parseInt(String.valueOf(N.charAt(i)));
            n = (n+num)%9;
        }
        
        System.out.println((n==0) ? "Yes" : "No");
    }
}
