import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char moji[] = s.toCharArray();
    int r = 0,g = 0,b = 0;
    for(int i = 0;i<n;i++){
      if(moji[i]=='R'){
        r++;
      }else if(moji[i]=='G'){
        g++;
      }else{
        b++;
      }
    }
    int count = r * g * b;
    for(int i = 0;i<n-2;i++){
      for(int j = i + 1;2*j - i < n;j++){
        if(moji[i] != moji[j] && moji[j] != moji[2*j-i] && moji[i] != moji[2*j-i]){
          count--;
        }
      }
    }
    System.out.println(count);
  }
}

