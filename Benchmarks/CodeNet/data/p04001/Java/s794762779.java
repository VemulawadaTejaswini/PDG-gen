import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    int n = line.length();
    long sum = 0;
    for(int i=0;i<n;i++){
      int digit = Integer.parseInt(line.substring(i,i+1));
      int j = n - i - 1; // number of operators in the right side
      if(j > 0)
      	sum += digit * pow(2,n-2) * (pow(5,j) - 1) / 4;
      sum += digit * pow(2,i) * pow(10,j);
    }
    System.out.println(sum);
  }
  
  private static long pow(int a, int n){
    if(n == 0){
      return 1;
    }else{
      int half = n / 2;
      int b = n & 1;
      long halfpower = pow(a, half);
      if(b == 0){
        return halfpower * halfpower;
      }else{
        return halfpower * halfpower * a;
      }
    }
  }
}