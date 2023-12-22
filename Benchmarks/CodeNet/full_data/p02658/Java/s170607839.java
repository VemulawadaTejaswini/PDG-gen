import java.util.Arrays;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    long n,prod,check;

	n = sc.nextInt();
    long[] a = new long[(int)n];
    
    check = (long) Math.pow(10,18);
    prod = 1;
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
      
    for(int i=0;i<n;i++){
        if(prod*a[i]>check){
            System.out.println(-1);
            return;
        }
        prod = prod * a[i];
    }
      
    System.out.println(prod);
    
    
  }
  
}
