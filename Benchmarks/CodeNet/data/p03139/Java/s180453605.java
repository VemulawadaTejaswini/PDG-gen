import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int x=sc.nextInt();//対象者
      int a=sc.nextInt();//X新聞購読者
      int b=sc.nextInt();//Y新聞購読者
      int c=a+b;//X新聞とY新聞の購読者合計
      int d=0;
      int g=0;
      
      if(a>b){
      
        if(x>=c){
        g=0; 
          System.out.println(b+" "+g);
      }else{
          
          if(x==a){
          System.out.println(b+" "+b);
          }else{
             d=c-x;
        System.out.println(b+" "+d);
          }
       
      }
        
      }else if(b>a){
        
        if(x>=c){
        g=0;
          System.out.println(a+" "+g);
      }else{
          
          if(x==b){
          System.out.println(a+" "+a);
          }else{
             d=c-x;
          System.out.println(a+" "+d);
          }
        
      }
        
      }else{
        
        if(a==b && a==x && b==x){
          System.out.println(a+" "+b);
      	}else{
           g=0; 
          System.out.println(a+" "+g);
        }
        
      }
      
		
	}
}