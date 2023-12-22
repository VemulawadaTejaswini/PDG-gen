import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String A = sc.next();
    if(N < A.length()){
      String tmpS = A.substring(0, N) + "...";
      System.out.println(tmpS);
    }else{
      System.out.println(A);
    }


  }
}


