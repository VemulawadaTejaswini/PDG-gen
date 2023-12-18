public class Main{
  public static void main(String[] args){
    int A = new java.util.Scanner(System.in).nextInt();
    int B = new java.util.Scanner(System.in).nextInt();
    int C = new java.util.Scanner(System.in).nextInt();
    int D = new java.util.Scanner(System.in).nextInt();

    int big;
    int small;
    int ans;

    //kagen
    if(A>=C){
      small = A;
    }
    else{
      small = C;
    }

    //jogen
    if(B>=D){
      big = D;
    }
    else{
      big = B;
    }

    ans = big-small;
    System.out.println(ans);
  }
}
