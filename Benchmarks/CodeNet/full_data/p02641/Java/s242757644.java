import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());
    if(N == 0){
      System.out.println(X);
      return;
    }
    int p[] = new int[N];
    for(int i = 0; i<N;i++){
      p[i] = Integer.parseInt(sc.next());
    }
    boolean f = true;
    for(int j = 0;j<100-X;j++){
      int before = X - j;
      int after = X + j;
      for(int k =0;k<N;k++){
        if(before == p[k]){
          f = false;
        } 
      }
      if(f==true){
        System.out.println(X-j);
        return;
      }
      f = true;
      for(int k =0;k<N;k++){
        if(after == p[k]){
          f = false;
        } 
      }
      if(f==true){
        System.out.println(X+j);
        return;
      }
      f = true;
    }
  }
}