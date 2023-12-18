import java.util.*;  
public class Main{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int N = sc.nextInt();
	   int i;
	   int pow=1;
 double ans=0;
 for(i = 1; i <= N; i++){
     pow = pow * i;
     ans = pow % (Math.pow(10,9)+7);
 }
 System.out.println((int)ans);
     }
 }
