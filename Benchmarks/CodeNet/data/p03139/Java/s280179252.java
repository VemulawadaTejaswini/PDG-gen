import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int x=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a+b;
      int d=0;
      int g=0;
      
      if(a>b){
        
        if(x>=c){
        g=0; 
          System.out.println(b+" "+g);
      }else{
        d=(x-b)-(x-a);
        System.out.println(b+" "+d);
      }
      }else if(b>a){
        
        if(x>=c){
        g=0;
          System.out.println(a+" "+g);
      }else{
        d=(x-a)-(x-b);
          System.out.println(a+" "+d);
      }
        
      }else{
        System.out.println(a+" "+b);
      }
      
		
	}
}