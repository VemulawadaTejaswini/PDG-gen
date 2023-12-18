import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    String alp[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for(int i = 0;i<n;i++){
      s[i] = sc.next();
    }
    String ans = "";
    for(String al:alp){
      char[] alc = al.toCharArray();
      int max = 100;
      for(int i = 0;i<n;i++){
        int count = 0;
        for(char x:s[i].toCharArray()){
          if(x == alc[0])count++;
        }
        max = Math.min(max,count);
      }
      for(int i = 0;i<max;i++){
        ans += al;
      }
    }
    System.out.println(ans);
  }
}
