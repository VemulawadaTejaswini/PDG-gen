import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
    
   int n,a,b,c=0,d=0; 

   Scanner sc = new Scanner (System.in);
   n=sc.nextInt();
   a=sc.nextInt();
   b=sc.nextInt();
 
   for(int i=1;i<=n;i++){
    c=(i/10)+(i%10);
    if(c>=a && c<=b){
     d=d+i;
    }
   }    
   System.out.println(d);
  }
}