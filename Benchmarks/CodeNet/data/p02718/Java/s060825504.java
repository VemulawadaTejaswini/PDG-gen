import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double m = sc.nextDouble();
    double a[] = new double[n];
    double sum = 0;
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextDouble();
      sum += a[i];
    }
    int cnt = 0;
    
    for(int i=0;i<n;i++){
      if(a[i] > sum / 4 /m)
        cnt += 1;
    }
    
    String ans;
    if(cnt >= m)
      ans = "Yes";
    else
      ans = "No";

    System.out.println(ans);
  }
}