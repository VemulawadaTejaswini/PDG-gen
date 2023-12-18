import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    long result = solve(k);
    System.out.println(result);
  }
  public static long solve(int k){
    List<String> list = new ArrayList<>();
    if (k <= 9){
      return k;
    } else {
      for (int i=1; i<=9; i++){
        list.add(String.valueOf(i));
      }
    }
    int counter = 9;
    while (true){
      List<String> nextList = new ArrayList<>();
      for (String s : list){
        add(nextList, Long.parseLong(s));
      }
      if (counter + nextList.size() > k){
        return Long.parseLong(nextList.get(k-counter-1));
      } else {
        counter += nextList.size();
        list = nextList;
      }
    }
  }
  public static void add(List<String> list, long num){
    String s = String.valueOf(num);
    char c = s.charAt(s.length()-1);
    if(c == '0'){
      list.add(s + "0");
      list.add(s + "1");
    } else if(c == '9'){
      list.add(s + "8");
      list.add(s + "9");
    } else {
      for (int i=0; i<3; i++){
        int n = c - '0';
        list.add(s + (n + i -1));
      }
    }
  }
}
