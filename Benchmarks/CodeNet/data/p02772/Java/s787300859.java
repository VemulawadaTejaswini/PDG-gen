import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        Integer[] num = new Integer[n];
        for(int i=0; i<n; i++) {
        	num[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
        	if(num[i]%2==0) {
        		if(num[i]%3==0 || num[i]%5==0) {
        			flag=true;
        		}
        		else {
        			flag=false;
        			break;
        		}
        	}
        }
        if(flag) {
        	System.out.println("APPROVED");
        }
        else {
        	System.out.println("DENIED");
        }
        
	}
}