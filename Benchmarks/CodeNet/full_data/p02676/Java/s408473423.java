import java.util.*;
import java.io.*;
 
public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        // while(t-->0){
            int k = sc.nextInt();
            String s = sc.next();
            if(s.length() > k){
                System.out.println(s.substring(0, k) + "...");
            } else{
                System.out.println(s);
            }
        // }
    }
}