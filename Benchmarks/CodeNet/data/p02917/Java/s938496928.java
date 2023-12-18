import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b[] = new int[n+1];
    b[0] = 10000000;
    b[n] = 10000000;
    int answer=0;
    for(int i=1;i<n;i++){
      b[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      answer = answer + Math.min(b[i],b[i+1]);
    }
    System.out.println(answer);
  }
}