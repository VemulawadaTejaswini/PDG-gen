import java.util.Scanner;
public class Main {
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int x,y,i=0;
     int[] c=new int[3001];
     int[] d=new int[3001];
     for(;;){
         x=sc.nextInt();
         y=sc.nextInt();
         if(x<y){
         c[i]=x;
         d[i]=y;}
         else {
             c[i]=y;
             d[i]=x;
		  	
         }
         i=i+1;
         if(x==0)
             if(y==0)break;
     }       
     for(int a=0;a<i-1;a++)
     System.out.println(c[a]+" "+d[a]);
    sc.close();
 }
    
    
}
