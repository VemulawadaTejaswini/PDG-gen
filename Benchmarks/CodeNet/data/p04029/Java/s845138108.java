import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int n[] = new int[N];
    int c = 1;
    int cnt = 0;
    
    for(int i=0; i<N; i++){
      n[i]= c;
      cnt += n[i];
      c = n[i]*2;
    }
    System.out.println(cnt);
  }
}