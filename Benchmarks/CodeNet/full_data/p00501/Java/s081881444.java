import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String str1 = sc.next();
    	String[] str2 = new String[N];
    	int answer = 0,com = 0;
    	
    	for(int i = 0;i < N;i++){
    		str2[i] = sc.next();
    	}
    	
    	for(int i = 0;i < str2.length;i++){
    		for(int j = 0;j < str2[i].length();j++){
    			com = answer;
    			if(str2[i].charAt(j) == str1.charAt(0)){    				
    				int space = 1;
    				int count = 0;
    				int s = 1;
    				while(true){
    					for(int k = 1;k < str1.length();k++){
    						if(str2[i].charAt(j + space * s) == str1.charAt(k)){
    							count++;
    						}
    						s++;
    					}
    					
    					if(count == str1.length() - 1){
							answer++;
							break;
    					}
    					
    					space++;
    					if(space * str1.length() - 1 > str2[i].length() - j)
    						break;
    				}
    				if(com < answer)
    					break;
    			}
    		}
    	}
    	
    	System.out.println(answer);
    	
    }
}