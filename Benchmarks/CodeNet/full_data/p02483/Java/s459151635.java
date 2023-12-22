import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=b<=c){
        	System.out.println(a+""+b+""+c);
         	}
         	if(a<=c<=b){
         		System.out.println(a+""+c+""+b);
         	}
         	if(b<=a<=c){
         		System.out.println(b+""+a+""+c);
         	}
         	if(b<=c<=a){
         		System.out.println(b+""+c+""+a);
         	}
         	if(c<=a<=b){
         		System.out.println(c+""+a+""+b);
         	}
         	if(c<=b<=a){
         		System.out.println(c+""+b+""+a);
         	}

        }