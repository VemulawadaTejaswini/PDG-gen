import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a[] = new int[10001];
    
    for(int i = 0; i < 10001; i++)
      a[i] = 0;

    for(int i=1; i <= 100; i++){
      for(int j=1; j<= 100; j++){
        for(int k=1; k<=100; k++){
          int r = i*i + j*j + k*k + i*j + i*k + j*k;
          if(r < 10001) {
            a[r]++;
          }
        }
      }
    }
    for(int i = 1; i <= n; i++)
      System.out.println(a[i]);
  }
}
