import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] data = new int[1000];
    int n = scanner.nextInt();
    int sum = 0;
    double p = 0;
    double ave;
    for (int i = 0; i < n; i++){
      int a = scanner.nextInt();
      data[i] = a;
      sum += a;
    }
    ave = (double)sum / n;
    for(int i = 0; i < n; i++){
      p += (data[i] - ave)*(data[i] - ave);
    }
    p /= n;
    double s = Math.sqrt(p);
    System.out.println(s);
  }
}