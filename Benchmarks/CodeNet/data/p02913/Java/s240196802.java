import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner read = new Scanner(System.in);
      int n = read.nextInt(); read.nextLine(); String s = read.nextLine();
      int ans = 0;
      for(int i = 0; i<=s.length(); i++){
          for(int j = i+1; j<s.length(); j++){
              String str = s.substring(i, j);
              String str1 = s.substring(j);
              String str2 = s.substring(0, i);
              if(str1.contains(str)||str2.contains(str)){
                  if(str.length()>ans){
                      ans = str.length();
                  }
              }
          }
      }
      System.out.println(ans);
    }
}