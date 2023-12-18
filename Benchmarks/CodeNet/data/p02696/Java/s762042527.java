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
    Long N=sc.nextLong();
    Double S=0.0;
    if(B-1<=N){
      S=Math.floor(A*(B-1)/B)-(A*(Math.floor((B-1)/B)));

    }else{
      S=Math.floor(A*(N)/B)-(A*(Math.floor((N)/B)));
    }

      System.out.println(S);




  }
}
