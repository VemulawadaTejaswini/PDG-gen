import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    int n = s.length;
    int a = 0;
    for(int i = 0; i < n / 2; i++){
      if(s[i] == s[n - 1 - i]){
        continue;
      }else{
        a++;
      }
    }
    System.out.println(a);

  }
}