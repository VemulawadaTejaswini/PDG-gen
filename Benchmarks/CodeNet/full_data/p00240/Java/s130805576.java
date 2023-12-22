import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
   for(;;){
       int n=sc.nextInt();
   if(n==0)break;
   int bank[]=new int[n];
   double nennri[]=new double[n];
   int y=sc.nextInt();
   for(int i=0; i<n; i++){
	   bank[i]=sc.nextInt();
	   double r=sc.nextDouble();
	   int t=sc.nextInt();
	   if(t==1)nennri[i]=1+y*r/100;
	   else{ nennri[i]=1;
		   for(int j=0;j<y;j++)nennri[i]*=(1+(r/100));}
   }
   double most=0; int mostb=0;
   for(int i=0;i<n;i++){
	   if(most<nennri[i]){
		   most=nennri[i]; mostb=bank[i];
	   }
   }
   System.out.println(mostb);
   }
   }
 } 