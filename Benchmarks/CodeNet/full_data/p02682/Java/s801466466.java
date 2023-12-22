import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int i = 0;
      int a,b,c,k;
      String an = scan.nextLine();
      String atai[] = an.split(" ",0);
      int num[] = new int[4];
      while(i < 4){
     //   System.out.println(atai[i]);
        num[i] = Integer.parseInt(atai[i]);
        i++;
      }
      a = num[0];
      b = num[1];
      c = num[2];
      k = num[3];
        maxCal(a,b,c,k);
        scan.close();
    }
  
  public static void maxCal(int A , int B, int C, int K){   
    int S,T;
    if(A >= K){
       System.out.println(K);
      return;
    }else if((A+B) >= K){
       System.out.println(A);
      return;
    }else{
       S = K-(A+B);
       T = A - S;
       System.out.println(T);
      return;
    }
  }
}