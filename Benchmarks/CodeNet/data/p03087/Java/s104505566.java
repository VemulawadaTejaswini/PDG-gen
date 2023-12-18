import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int Q = Integer.parseInt(S[1]);
    String[] T = sc.nextLine().split("");
    int[] val = new int[N];
    int count = 0;
    for(int i = 1; i < N; i++){
      if(T[i-1].equals("A") && T[i].equals("C")){
        count++;
      }
      val[i] = count;
    }
    
    for(int i = 0; i < Q; i++){
      String[] U = sc.nextLine().split(" ");
      int a = Integer.parseInt(U[0])-1;
      int b = Integer.parseInt(U[1])-1;
      System.out.println(val[b]-val[a]);
    }
  }
}