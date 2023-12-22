import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String str1 = sc.next();
    	String[] str2 = new String[N]; 
    	int answer = 0,com = 0,space = 0,count = 0;
    	
    	for(int i = 0;i < N;i++){
    		str2[i] = sc.next();
    	}
    	
    	to:
    	for(int i = 0;i < str2.length;i++){
    		for(int j = 0;j < str2[i].length();j++){
    			if(str1.charAt(0) == str2[i].charAt(j)){
    				for(int k = j + 1;k < str2[i].length();k++){
    					if(str1.charAt(1) == str2[i].charAt(k)){
    						space = k - j;
    						for(int s = 1;s <= str1.length() - 2;s++){
    							if(str1.charAt(1 + s) == str2[i].charAt(k + space * s))
    								count++;
    						}
    						if(count == str1.length() - 2){
    							answer++;
    							break to;
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	
    	
    	
    	System.out.println(answer);
    	
    }
}