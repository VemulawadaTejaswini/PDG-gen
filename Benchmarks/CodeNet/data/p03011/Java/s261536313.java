import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int a[]=new int[3];
    a[0]=sc.nextInt();
    a[1]=sc.nextInt();
    a[2]=sc.nextInt();
    Arrays.sort(a);
    System.out.println((a[0]+a[1]));
  }
}