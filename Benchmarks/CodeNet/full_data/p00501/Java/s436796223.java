package main;
import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String newboard = sc.next();
    	String oldboard;
    	int answer = 0;
    	int count = 0;
    	
    	for(int i = 0;i < N;i++){
    		oldboard = sc.next();
    		for(int j = 0;j < oldboard.length();j++){
    			if(newboard.charAt(0) == oldboard.charAt(j)){
    				for(int k = j + 1;k < oldboard.length();k++){
    					if(newboard.charAt(1) == oldboard.charAt(k)){
    						int distance = k - j;
    						int n = 2;
    						for(int s = k + distance;s < oldboard.length();s += distance){
    							if(newboard.charAt(2) == oldboard.charAt(s)){
    								count++;
    							}
    							if(n < newboard.length())
    								n++;
    						}
    						if(count == newboard.length() - 2){
    							answer++;
    							break;
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	System.out.println(answer);
    	
    }
}