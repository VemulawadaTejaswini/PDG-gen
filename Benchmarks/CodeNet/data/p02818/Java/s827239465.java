import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    long A=scanner.nextLong();
    long B=scanner.nextLong();
    long K=scanner.nextLong();
    
    
    if(A>=K){
      A=A-K;
      System.out.println(A);
      System.out.println(B);
    }else if(A<K&&A+B>K){
      long j=A+B-K;
      System.out.println(0);
      System.out.println(j);
    }else{
      System.out.println(0);
      System.out.println(0);
    }
                         }
                         }
                         
                        