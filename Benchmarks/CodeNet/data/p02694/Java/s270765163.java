import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double X=sc.nextDouble();
    Double N=100.0;
    long S=0;
    while(true){
      if(N>=X){
         break;
      }
        S++;
        N=N*1.01;
        if(!(N%1==0)){
          N=N-N%1;
        }
    }

      System.out.println(S);




  }
}
