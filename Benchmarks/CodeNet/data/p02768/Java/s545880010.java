import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long sum = 0;
    long before = 1;
    
    for(long i=1; i<=n; i++){
      long score = before *(n - i + 1) / i;
      before = score; 
      if(i != a && i != b) sum += score;
    } 
    System.out.println(sum % (Math.pow(10,9) + 7));
  }
}
