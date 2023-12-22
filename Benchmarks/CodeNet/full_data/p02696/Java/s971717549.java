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
    int N=sc.nextInt();
    Double S=0.0;
    Double R=0.0;
    Double L=0.0;
    int i=0;
    int count=0;
    Double D=0.0;
    while(true){
      S=Math.floor(A*i/B)-(A*(Math.floor(i/B)));
      L=Math.floor(A*(i+1)/B)-(A*(Math.floor((i+1)/B)));
      if(S-L>0){
        D=S;
      }
      if(L-S>0){
        D=L;
      }
      if(D>R){
        R=D;
      }
      i=i+2;
      count++;
      if(N%2==0){
        if(count==N-1){
          break;
        }
      }
        if(!(N%2==0)){
          if(count==(N+1)/2){
            break;
        }
      }
    }
    if(N%2==0){
      S=Math.floor(A*(N/B)-(A*(Math.floor(N/B))));
      if(S>R){
        R=S;
      }
    }

       int C=(int)(R/100.0*100);
      System.out.println(C);




  }
}
