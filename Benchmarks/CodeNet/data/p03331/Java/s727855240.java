import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int total = Integer.MAX_VALUE;
    for(int i=1; i<n; i++){
      int x = sum(i)+sum(n-i);
      if(total > x){
        total = x;
      }
    }
    System.out.println(total);

    sc.close();
  }

  public static int sum(int x){
    int sum = 0;
    while(x > 0){
      sum += x%10;
      x /= 10;
    }
    return sum;
  }
}