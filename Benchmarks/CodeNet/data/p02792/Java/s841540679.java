import java.util.*;

public class Main{
  static int N;
  static String[] zero = {"0", "00", "000", "0000"};
  static String[] nine = {"9", "99", "999", "9999"};
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int ans = 0;
    for(int i = 1; i <= N; i++){
      String S = i+"";
      char c1 = S.charAt(0);
      char c2 = S.charAt(S.length()-1);
      ans += func(c1, c2);
    }
      
    System.out.println(ans);
  }
  static int func(char c1, char c2){
    int ret = 0;
    if(c1 == c2){
      ret++;
    }
    if(c1 == '0' || c2 == '0'){
      return 0;
    }
    String S = String.valueOf(c1);
    String T = String.valueOf(c2);
    
    int B = Integer.parseInt(T+S);
    if(B <= N){
      ret += 1;
    }else{
      return ret;
    }
    
    int A = Integer.parseInt(T+zero[0]+S);
    B = Integer.parseInt(T+nine[0]+S);
    if(B <= N){
      ret += 10;
    }else if(A <= N){
      int C = (N-A)/10+1;
      ret += C;
    }else{
      return ret;
    }
    
    A = Integer.parseInt(T+zero[1]+S);
    B = Integer.parseInt(T+nine[1]+S);
    if(B <= N){
      ret += 100;
    }else if(A <= N){
      int C = (N-A)/10+1;
      ret += C;
    }else{
      return ret;
    }
    
    A = Integer.parseInt(T+zero[2]+S);
    B = Integer.parseInt(T+nine[2]+S);
    if(B <= N){
      ret += 1000;
    }else if(A <= N){
      int C = (N-A)/10+1;
      ret += C;
    }else{
      return ret;
    }
    
    A = Integer.parseInt(T+zero[3]+S);
    B = Integer.parseInt(T+nine[3]+S);
    if(B <= N){
      ret += 10000;
    }else if(A <= N){
      int C = (N-A)/10+1;
      ret += C;
    }
    return ret;
  }
}