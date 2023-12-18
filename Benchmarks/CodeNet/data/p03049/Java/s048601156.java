import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a_c = 0;
    int b_c = 0;
    int ab_c = 0;
    int count = 0;
    for(int i = 0;i < N;i++){
      String str = sc.next();
      int len = str.length();
      if(str.charAt(0) == 'B' && str.charAt(len-1) == 'A')ab_c++;
      else if(str.charAt(0) == 'B')b_c++;
      else if(str.charAt(len-1) == 'A')a_c++;
      if(len == 2&&str.charAt(0) == 'A' && str.charAt(1) == 'B')count++;
      else for(int j = 0;j < len-2;j++)if(str.charAt(j) == 'A' && str.charAt(j+1) == 'B')count++;
    }
    int ans = count;
    if(a_c == 0 && b_c == 0 && ab_c < 2);
    else if(a_c == 0 && b_c == 0 && ab_c > 1)ans += ab_c-1;
    else{
      ans += ab_c-1;
      if(a_c > b_c){
        ans += b_c+1;
      }else{
        ans += a_c+1;
      }
    }
    System.out.println(ans);
  }
}