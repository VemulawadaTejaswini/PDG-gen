import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = n-1;
    int c[] = new int[num];
    int s[] = new int[num];
    int f[] = new int[num];
    for(int i = 0 ; i < num ; ++i){
      c[i] = sc.nextInt();
      s[i] = sc.nextInt();
      f[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i < num ; ++i){
      int t = 0;
      for(int j = 0 ; j < num-i ; ++j){
        if(t<s[i+j]){
          t = s[i+j];
        }else if(t%f[i+j] != 0){
          t += f[i+j]-(t%f[i+j]);
        }
        t += c[i+j];
      }
      System.out.println(t);
    }

    System.out.println(0);
    
  }
}