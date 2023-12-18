import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      long A = sc.nextLong();
      long B = sc.nextLong();
      long K = sc.nextLong();
      
      if(A+B<=K){
       System.out.println(0+" "+0);
      }
      else if(A<=K && A+B>=K){
       System.out.println(0+" "+((A+B)-K));
      }
      else if(A>K && A+B>=K){
       System.out.println((A-K)+" "+B);
      }
      else{
      System.out.println(A+" "+B);
      }
    }
}