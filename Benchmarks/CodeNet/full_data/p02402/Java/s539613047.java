/*AOJ-ITP-4-4*/

/* 
 *  n ????????´??° ai(i=1,2,...n)?????\?????????
 *  ????????????????°????????????§??????????¨????????±???????????????°?????????????????????????????????
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String st[] = br.readLine().split(" ");
    	int sum = 0;
    	int mean = 0;
    	int max = 0;
    	int min = 0;
    	while(true){
    		int number = Integer.parseInt(br.readLine());
            int[] mathNumber = new int[number];
            for(int i = 0 ; i <= mathNumber.length ; i++){
            	mathNumber[i] = Integer.parseInt(st[i]);
            	sum = sum + mathNumber[i];
            	if(!(i == mathNumber.length -1)){max = Math.max(mathNumber[i], mathNumber[i+1]);}
            	if(!(i == mathNumber.length -1)){min = Math.min(mathNumber[i], mathNumber[i+1]);}
                if(i == mathNumber.length){
                	System.out.println(min + " " + max + " " + sum);
               }
            }
    	}
      
    }
}