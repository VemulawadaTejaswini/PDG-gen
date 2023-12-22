import java.util.Scanner;

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
        	int[] ice = new int[10];
        	for(int i = 0;i < n;i++){
        		ice[sc.nextInt()]++;
        	}
        	for(int a : ice){
        		for(int i = 0;i < a;i++){
        	    	System.out.print('*');
         	   }
        	    if(a <= 0){
        	    	System.out.println('-');
        	    }else{
         		   	System.out.println();
        	    }
        	}
        } while((n = sc.nextInt()) != 0);
    }
}
