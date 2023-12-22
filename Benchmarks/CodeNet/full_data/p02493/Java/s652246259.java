import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ary[] = new int[n];
    for(int i=0;i<n;i++){
      ary[i] = scan.nextInt();
    }
    for(int i=n-1;i>=0;i--){
      if(i != n - 1) System.out.print(" ");
      System.out.print(ary[i]);
    }
    System.out.println();
  }
}