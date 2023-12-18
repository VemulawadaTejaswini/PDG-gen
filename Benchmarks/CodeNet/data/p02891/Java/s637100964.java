import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();

    long ans = 0;
    int count =1;
    char prev='$';
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if(c == prev){
        count++;
      }else{
        list.add(count);
        ans += count/2;
        count=1;
        prev=c;
      }
    }
    list.add(count);
    ans += count/2;

    ans = ans * K;

    if( (K > 1)
        && (S.charAt(0)==S.charAt(S.length()-1))
        && (list.get(1) % 2 == 1)
        && (list.get(list.size()-1) % 2 == 1)
      ){
      ans += K-1;
    }
    System.out.println(ans);
  }


}
