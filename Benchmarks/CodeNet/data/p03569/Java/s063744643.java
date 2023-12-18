import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPalindrome(String s){
        int L = s.length();
        boolean ans = true;
        for(int l=0;l<L/2;l++){
        	if(s.charAt(l)!=s.charAt(L-1-l)) ans = false;
        }
        return ans;
    }
    public static int solve(String given){
    	int L = given.length();
    	if(L<=1) return 0;
    	String copy = new String(given);
    	if(!isPalindrome(copy.replaceAll("x",""))) return -1;
    	boolean first = given.charAt(0)=='x';
    	boolean last = given.charAt(L-1)=='x';
    	
    	if((!first)&&last){
    	    return 1+solve(given.substring(0,L-1));
    	}
    	if(first&&(!last)){
    	    return 1+solve(given.substring(1,L));	
    	}
    	return solve(given.substring(1,L-1));//the first char and the last char are the same
    }	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        System.out.println(solve(given));
    }
}