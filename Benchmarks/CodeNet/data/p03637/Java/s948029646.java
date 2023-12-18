import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int c1, c2, c4;
    c1 = c2 = c4= 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      int count = 0;
      while(true){
        if(n % 2 == 0){
          n /= 2;
          count++;
        }else{
          break;
        }
      }
      
      if(count == 0){
        c1++;
      }else if(count == 1){
        c2++;
      }else{
        c4++;
      }
    }
    String ans = "";
    if(c2 > 0){
      c1++;
    }
    if(c4+1 >= c1){
      ans = "Yes";
    }else{
      ans = "No";
    }
    
    System.out.println(ans);
  }
}