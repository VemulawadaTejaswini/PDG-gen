import java.util.*;
public class Main{

     public static void main(String []args){
        
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[10000001];
        for(int i=1;i<=1000000;i++){
            
                
            for(int j=i;j<=10000000;j=j+i){
                if(j%i==0){
                    a[j]++;
                }            
            }
            
            
        }
        
        int count=0;
        for(int i=1;i<=n;i++){
        //  System.out.println("a[i]  i"+" "+a[i]+" "+i);
            count=count+(i*(a[i]));
        }
        System.out.println(count);
     }
}