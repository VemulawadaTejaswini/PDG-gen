import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String ards[]){
    	Scanner sc = new Scanner(System.in);
 		int N = sc.nextInt();
      	String S1 = sc.next();
      	String S2 = sc.next();
      
      	long ans = 0;
      	int[] dom = new int[N+10];
      	int index=0;
      	for(int i = 0;i<N;i++){
        	if(S1.charAt(i)==S2.charAt(i)){
            	dom[index] = 1;
            }else{
            	dom[index] = 2;
                i++;
            }
        	index++;
        }
      	
      	if(dom[0]==1){
        	ans=3;
        }else if(dom[0]==2){
        	ans=6;
        }
      	for(int i =1;dom[i]!=0;i++){
        	if(dom[i-1]==1){
				ans = ans*2;
            }else if(dom[i-1]==2){
            	if(dom[i]==2){
                	ans = ans*3;
                }
            }
      	ans = ans%1000000007;
        }
      	System.out.println(ans);
    }
}