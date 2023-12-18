import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int a1 = a + 1;
        int b1 = b + 1;
        int res = -1;
        for(int i = 0; i<=1262; i++) {
        	if(i*0.08>=a && (a+1)>i*0.08 && i*0.1>=b && (b+1)>i*0.1) {
        		res = i;
        		break;
        	}
        }
        
       
        
        
        
        
        
        
        
        System.out.print(res);
        
	}
}