import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int m=kbd.nextInt();
   long k=kbd.nextLong();
   int[] A= new int[Math.max(n,m)];
   for(int i=0;i<Math.max(n,m);i++){
     A[i]=kbd.nextInt();
   }
   int[] B= new int[Math.max(n,m)];
   for(int i=0;i<Math.max(n,m);i++){
     B[i]=kbd.nextInt();
   }
   long a=0;
   int i=0;
   int j=0;
   int b=0;
   int z=0;

   while(a<k||b<n+m){
     int x=A[i];
     int y=B[j];
    z=Math.min(x,y);
    if(y==0){z=x;}
    if(x==0){z=y;}
    a=a+z;
   if(x>y){
     i++;
   }else{
     j++;
   }
   y++;
   }
   if(b==n+m){
     System.out.println(b);
   }else
   System.out.println(b-1);
 }
}