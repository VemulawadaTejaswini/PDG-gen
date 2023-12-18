import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

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

    //no common
    if(B<=C){
      big = 0;
      small = 0;
    }


    ans = big-small;
    System.out.println(ans);
  }
}
