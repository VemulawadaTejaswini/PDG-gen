//9-A


import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String W = sc.next();//10文字以下の単語
    	
    	int count = 0;
    	
    	while(true){
    		
    		String T = sc.next();//1000文字以下の文章
    		
    		if(T.equals("END_OF_TEXT")){
    			break;
    		}
    		
    		int hantei = T.indexOf(W);
            
            if(hantei != -1){
            	count++;
            }
    		
    	}
    	
    	System.out.println(count);
    	
    }
}