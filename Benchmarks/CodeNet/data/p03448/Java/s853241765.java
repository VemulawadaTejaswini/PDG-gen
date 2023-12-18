import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    int C=in.nextInt();
    int X=in.nextInt();
    int l=0;
    for (int i=0;i<=A ;i++ ) {
      for (int j=0;i<=B ;j++ ) {
        for (int k=0; k<=C;k++ ) {
          if (X==500*i+100*j+k*50) {
            l++;
          }
        }
      }
      if (i==A) {
        System.out.println(l);
      }
    }

  }
}