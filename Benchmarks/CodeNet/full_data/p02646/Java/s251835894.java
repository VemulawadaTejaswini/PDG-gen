import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
   	int A,B,V,W,T,tmp;
    A = scn.nextInt();
    V = scn.nextInt();
    B = scn.nextInt();
    W = scn.nextInt();
    T = scn.nextInt();
    if (B > W){
      tmp = V-W;
      if (tmp*T+A > B){
		System.out.print("Yes");
      }else{
        System.out.print("No");
      }
    }else{
      System.out.print("No");
    }
  }
}