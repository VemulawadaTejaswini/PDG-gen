package Main;

import java.util.Scanner;
class Main{
    private static Scanner sc;

	public static void main(String[] args){
        while(true){
        	sc = new Scanner(System.in);
        	
            int a = sc.nextInt();
            int b =sc.nextInt();
            if(a == 0 && b == 0) break;
            
            
            if(a < b) {
            	System.out.println(a + " " + b);
            }
            else{
            	System.out.println(b + " " + a);
            }
        }
    }
}