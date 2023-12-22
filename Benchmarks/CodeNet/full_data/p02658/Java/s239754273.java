import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long[] arrays = new long[n];
    for (int i = 0; i < n; i++) {
        arrays[i] = sc.nextLong();
    }
    
    try {
    long sum = 1;
    for (int i = 0; i < n; i++) {
        sum *= arrays[i];
        
    }
     long judge = (long)Math.pow(10, 18);
    if (sum > judge) {
        System.out.println(-1);
    } else {
        System.out.println(sum);
    }
    } catch (InputMismatchException sum) {
        System.out.println(-1);
    }
    
   
     
      }
}