import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long ans = 1;
    for(long l=0;l<n;l++){
      ans *= scan.nextLong();
    }
    System.out.println((ans>=1000000000000000000L)?-1:ans);
  }
}