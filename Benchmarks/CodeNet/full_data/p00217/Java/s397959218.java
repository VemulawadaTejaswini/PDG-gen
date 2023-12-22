import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
 for(;;){
	 int n =sc.nextInt();
   if(n==0)break;
 int []num =new int[n];
 int []kyori =new int[n];
   for(int i=0; i<n; i++){
	 num[i]=sc.nextInt();
	 kyori[i]+=sc.nextInt();
	 kyori[i]+=sc.nextInt();
 }
   int most=0; int mostn=0;
   for(int i=0; i<n; i++){
    if(most<=kyori[i]){
    	most = kyori[i];
    	mostn = num[i];
    }
   }
   System.out.println(mostn+" "+most);
 }
 }
 }