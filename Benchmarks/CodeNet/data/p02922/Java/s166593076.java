import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 1;
        int cnt = 0;
        
        while(b > sum) {
        	
        	if(cnt >=1) {
        		sum += a-1;
        	} else {
        		sum += a;
              sum--;
        	}
        	cnt++;
        	
        }


        System.out.println(cnt);
        
        sc.close();
    }
}
