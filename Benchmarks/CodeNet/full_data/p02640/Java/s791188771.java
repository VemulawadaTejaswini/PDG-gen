import java.util.*;
class Main{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        //  int x1=sc.nextInt();
        //  int x2=sc.nextInt();
        //  int x3=sc.nextInt();
        //  int x4=sc.nextInt();
        //  int x5=sc.nextInt();
        int count=0;
        int temp=0;
        int m=sc.nextInt();
        int l=sc.nextInt();
        count=l-2*m;
        count=count/2;
        temp=m-count;

         if(count*4+temp*2==l&&(m*4>=l&&m-count>=0)){
        System.out.println("Yes");
        }
        else
         System.out.println("No");
     }
    
}