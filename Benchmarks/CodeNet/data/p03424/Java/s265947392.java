import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    boolean f = false;
    for(int i = 0; i < N; i++){
      if(S[i].equals("Y")){
        f = true;
        break;
      }
    }
    System.out.println(f ? "Four" : "Three");
  }
}