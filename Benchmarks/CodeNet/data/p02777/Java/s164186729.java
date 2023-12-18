import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    String[] T = sc.nextLine().split(" ");
    String U = sc.nextLine();
    int A = Integer.parseInt(T[0]);
    int B = Integer.parseInt(T[1]);
    if(U.equals(S[0])){
      A--;
    }else{
      B--;
    }
    System.out.println(A+" "+B);
  }
}