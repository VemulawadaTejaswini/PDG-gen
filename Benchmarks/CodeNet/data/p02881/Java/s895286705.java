import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = 1;
    long B = N;
    
    for (long i = 1;i<=Math.sqrt(N);i++) {
      if(N%i==0) { 
       A = i;
       B = N/i;
        if(A>=B){
          break;
        }
       }
      }
   
     System.out.println(A+B-2);
    
    }
  }