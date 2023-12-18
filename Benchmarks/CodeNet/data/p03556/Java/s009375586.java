import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int rt = (int) Math.floor(Math.sqrt(N));
    int ans = 0;
    int i = Math.max(0,rt-1);
    while(i*i<=N){
      ans = i*i;
      i++;
    }
    
    System.out.println(ans);
  }   
}