import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
     int A = 1;
     int B = N;
    
    for (int i = 1;i<=Math.round(N/2);i++) {
      if(N%i==0) {
        if(A<=B){
       A = i;
       B = N/i;
        }
      }
    }
   
     System.out.println(A+B-2);
    }
  }


