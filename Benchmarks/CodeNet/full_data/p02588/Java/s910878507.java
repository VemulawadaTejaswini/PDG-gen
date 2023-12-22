import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double s[] = new double[n];
    
    for(int i = 0; i < n; i++){
      s[i] = sc.nextDouble();
    }
    int cnt = 0;
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        double d = (s[i] * s[j]) * 1000;
        int d_i = (int)d;
        if((d - d_i)/1000 == 0.0)
          cnt++;
      }
    }
    System.out.print(cnt);
  }
}
