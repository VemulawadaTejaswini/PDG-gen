import java.lang.Math;
import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner v = new Scanner(System.in);
    	int n = v.nextInt();
      	while(n<1 || n > Math.pow(10,6)){
        	n = v.nextInt();
        }
      	int m = v.nextInt();
      	while(m<1 || m > Math.pow(10,4)){
        	m = v.nextInt();
        }
      	int a = v.nextInt();
      	for(int i = 0;i<m;i++){
          while (a < 1 || a > Math.pow(10,4)){
      		a = v.nextInt();
          }
          	n -= a;
      	}
      	if(n >= 0){
        	System.out.println(n);
        }else{
        	System.out.println(-1);
        }
      	
    }
}
