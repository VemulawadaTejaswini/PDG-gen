import java.util.*;
public class Main {
   public static int printDivisors(int n) 
    { 
     int count=0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) 
              count++;
        }
       return n*count     ;     
    } 
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
       int sum=0;
       for(int i=1;i<n+1;i++){
        int k= printDivisors(i);
        sum=sum+k;
      } 
      System.out.println(sum);
  }
 }