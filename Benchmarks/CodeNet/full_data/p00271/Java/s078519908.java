

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
    int a,b,c;
    int sa[] = new int[7];
    
    public void syukei(){
    	
    	System.out.println("一週間の気温を入れてください");
    	for(c=0;c<=6;c++){
    		a = sc.nextInt();
        	b = sc.nextInt();
        	sa[c] = a-b;
        	
    	}
    	
    	
    }
    
    public void hyouji(){
    	for(c=0;c<=6;c++){
    		System.out.println(sa[c]);
    }
    }
    
	
    
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	   
	               Main Ma = new Main();
		Ma.syukei();
		Ma.hyouji();
		


	    }
	}