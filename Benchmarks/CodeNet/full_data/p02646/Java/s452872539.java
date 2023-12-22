import java.util.*;

public class Main{
	public static void main(String[] args){
    	long a = sc.nextLong();
      	int v = sc.nextInt();
      	long b = sc.nextLong();
      	int w = sc.nextInt();
      	int t = sc.nextInt();
      	for(int cnt = 0;cnt < t;cnt++){
        	a += v;
          	b += w;
          	if(a == b){
            	System.out.println("YES");
              	System.exit(0);
            }
        }
      	System.out.println("NO");
    }
}