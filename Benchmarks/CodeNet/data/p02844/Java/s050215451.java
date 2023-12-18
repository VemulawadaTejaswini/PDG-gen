import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        //int d1 = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[3];
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = false;
        //for(int i = 0; i < s.length(); i++){
        //}
        int pass[] = new int[1000];
        
        int count = 0;
        
        for(int i = 0; i < 1000; i++){
        	pass[i] = i;
        }
        
        for(int i = 0; i < 1000; i++){
        	String aaa = String.valueOf(i);
        	char bbb[] = aaa.toCharArray();
        	
        	char num[] = new char[3];
        	if(i < 10){
        		num[0] = '0';
        		num[1] = '0';
        		num[2] = bbb[0];
        	}else if(i < 100){
        		num[0] = '0';
        		num[1] = bbb[0];
        		num[2] = bbb[1];
        	}else{
        		num[0] = bbb[0];
        		num[1] = bbb[1];
        		num[2] = bbb[2];
        	} 
        	
        	
        	
        	
        	boolean end = false;
        	boolean end2 = false;
    		for(int j = 0; j < s.length() - 2; j++){
    			String vvv = String.valueOf(j);
        		char vvvv[] = vvv.toCharArray();
    			if(vvvv[0] == num[0]){
    				end = true;
    				for(int k = j + 1; k < s.length() - 1; k++){
    					String ww = String.valueOf(k);
        				char www[] = ww.toCharArray();
    					if(www[0] == num[1]){
    						end2 = true;
    						for(int l = k + 1; l < s.length(); l++){
    							String zz = String.valueOf(l);
        						char zzz[] = ww.toCharArray();
    							if(zzz[0] == num[2]){
    								count++;
    								break;
    							}
    						}
    					}
    					
    					if(end2){
    						break;
    					}
    				}
    				if(end){
    					break;
    				}
    			}
    		}
        }
        
        System.out.println(count);
        
 
        //System.out.println();
        //System.out.print();
    }
}