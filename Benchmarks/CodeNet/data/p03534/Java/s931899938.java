import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean solve(String s){
    	int a=0,b=0,c=0;
    	for(int i=0;i<s.length();i++){
    	    char l = s.charAt(i);
    	    if(l=='a') a++;
    	    else if(l=='b') b++;
    	    else c++;
    	}
    	
    	
    	if(a==b) return -1<=a-c && a-c<=1;
    	if(a-b==1||b-a==1) return c==a || c==b;
    	return false;
    	
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        
        System.out.println(solve(given) ? "YES" : "NO");
        
    }
}