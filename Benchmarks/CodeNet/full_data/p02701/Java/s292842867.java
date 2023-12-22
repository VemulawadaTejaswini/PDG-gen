import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      int n = stdIn.nextInt();
      ArrayList<String> list = new ArrayList<String>();
      list.add(stdIn.next());
      String s;
      int dup = 0;
      for(int i=1; i<n; i++){
        s = stdIn.next();
        int j=0;
        while(j < list.size()-1 && less(s, list.get(j))){
          j++;
        }
        if(s.equals(list.get(j))){
          dup++;
        }
        list.add(j, s);
      }
      System.out.println(n-dup);
  }

  static boolean less(String a, String b){
    int i=0;
    char[] as = a.toCharArray();
    char[] bs = b.toCharArray();
    int minMaxIdx;
    boolean flag;
    if(as.length < bs.length){
      minMaxIdx = as.length-1;
      flag = true;
    }else{
      minMaxIdx = bs.length-1;
      flag = false;
    }
    while(i < minMaxIdx && as[i] ==  bs[i]){
      i++;
    }
    
    if(i == minMaxIdx){
      if(as[i] == bs[i]){
        return flag;
      }
    }

    return (as[i] < bs[i]);
  }
}