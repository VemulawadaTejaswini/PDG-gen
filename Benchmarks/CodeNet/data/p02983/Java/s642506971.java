import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long L = sc.nextInt();
    long R = sc.nextInt();
    sc.close();
    
    long a = 1000000000;

    for (long i = L; i < R; i++){
      
      long b = (i * (i+1) % 2019);

      if (b < a){
        a = b; 
      }

    }

    System.out.println(a);

  }
  
}