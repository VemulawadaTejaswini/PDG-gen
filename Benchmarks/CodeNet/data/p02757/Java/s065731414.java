import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    String s = sc.next();
    int count = 0;
    for(int i = 0;i<n;i++){
      for(int j = i+1;j<=n;j++){
        String ss = s.substring(i,j);
        int aa = Integer.parseInt(ss);
        if(aa % p == 0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
