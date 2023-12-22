import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int sum = 0, cnt = 0;
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <=i; j++){
        if(i %j == 0){
          ans.add(j);
          for(int k = 0; k < ans.size();k++){
            if(j % ans.get(k)== 0){
              continue;
            }
          }
          cnt++;
        }
      }
      sum += i*cnt;
      cnt= 0;
    }
    PrintWriter out  = new PrintWriter(System.out);
    out.print(sum);
    out.flush();
  }
}