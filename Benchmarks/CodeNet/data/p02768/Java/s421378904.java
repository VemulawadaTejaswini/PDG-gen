import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long scoreA=0, scoreB=0;
    long score = 0;
    long before = 1;
    
    for(int i=1; i<=a; i++){
    	score = before * (a-i+1)/i;
        before = score;
    }
    scoreA = score;
    score =0; before = 1;
    for(int i=1; i<=b; i++){
    	score = before * (b-i+1)/i;
        before = score;      
    }
    long x = (long)Math.pow(2,n) - 1;
    long ans = x - (scoreA + scoreB) % 1000000007;
    System.out.println(ans);
  
  }
}
