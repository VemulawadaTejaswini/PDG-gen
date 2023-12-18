import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int c4 = 0, c2 = 0, c = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n%4 == 0){
        c4++;
      }else if(n%2 == 0){
        c2++;
      }
    }
    c = N-c4-c2;
    
    String ans = "No";
    if(c2%2 == 0){
      if(c4 >= c-1){
        ans = "Yes";
      }
    }else{
      if(c4 >= c){
        ans = "Yes";
      }
    }
    System.out.println(ans);
  }
}