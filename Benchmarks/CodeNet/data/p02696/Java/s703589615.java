import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double A=sc.nextDouble();
    Double B=sc.nextDouble();
    Double N=sc.nextDouble();
    Double S=0.0;
    Double R=0.0;
    for(int i=0;i<=N;i++){
      S=Math.floor(A*i/B)-(A*(Math.floor(i/B)));
      if(S>R){
        R=S;
      }
    }

       int C=(int)(R/100.0*100);
      System.out.println(C);




  }
}
