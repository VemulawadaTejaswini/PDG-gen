import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int v[] = new int[N];
    int value = 0;
    for(int i=0; i<N; i++){
      v[i] = sc.nextInt();
    }
    for(int i=0; i<N-2; i++){
      value = (int)(v[i]+v[i+1])/2;
    }
    System.out.println(value);
  }
}