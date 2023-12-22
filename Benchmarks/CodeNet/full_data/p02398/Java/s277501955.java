/*AOJ-ITP-3-4*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = br.readLine().split(" ");
        int count = 0;
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        
        if(!((1 <= a && 1 <= b && 1 <= c && 10000 >= a && 10000 >= b && 10000 >= c) && (a <= b))){
        	System.exit(1);
        }
        for(int i = a; i <= b; i++){
            if((c % i) == 0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}