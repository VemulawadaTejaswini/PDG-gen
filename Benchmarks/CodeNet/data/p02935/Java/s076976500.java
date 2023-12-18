import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double v[] = new double[n];
    double tmp = 0;
    for(int i=0;i<n;i++){
      v[i]=sc.nextDouble();
    }
    Arrays.sort(v);
    tmp = v[0];
    for(int i=0;i<n-1;i++){
      tmp = (tmp+v[i+1])/2;
    }
    System.out.println(tmp);
    
  }
}