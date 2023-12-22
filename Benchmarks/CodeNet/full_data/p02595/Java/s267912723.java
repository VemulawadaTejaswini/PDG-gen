import java.util.*;

public class A{
	public static void main(String args[]){
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int d = sc.nextInt();
        int count = 0;
        while(n-->0){
        	int a = sc.nextInt();
            int b = sc.nextInt();
            double ans = Math.sqrt(a*a + b*b);
            if(ans<=d)
            count++;
        }
        System.out.println(count);
    }
}
