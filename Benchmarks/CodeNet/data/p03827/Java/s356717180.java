import java.util.*;


public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char I = 'I';
    int ans = 0;
    int maxAns = 0;
    char[]list = S.toCharArray();
    for(int i = 0; i < N; i++){
      // char A = list[i];
      if(list[i] == I){
        ans +=1;
        if(maxAns<ans){
          maxAns = ans;
        }
      }else{
        ans -=1;
      }
    }
    System.out.println(maxAns);
  }