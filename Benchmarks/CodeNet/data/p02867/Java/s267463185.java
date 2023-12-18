
import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int b[]=new int[n];
       for(int i=0;i<n;i++){
           b[i]=sc.nextInt();
       }

       boolean ans=true;
       int maxa=0;
       int maxb=0;
       for(int i=0;i<n;i++){
        if(maxa<a[i]) maxa=a[i];
        if(maxb<b[i]) maxb=b[i];
       }
       if(maxa>maxb) ans=false;

       Arrays.sort(a);
       Arrays.sort(b);

       for(int i=0;i<n;i++){
        if(a[i]>b[i]) ans=false;
       }
       
    

       if(ans) System.out.println("Yes");
       else System.out.println("No");


       
    }
}
