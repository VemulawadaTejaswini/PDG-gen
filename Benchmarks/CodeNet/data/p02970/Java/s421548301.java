import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
	  int n = sc.nextInt();
      int d = sc.nextInt();
      int cnt = 0;
      
      while(n > 0){
      	n -= d*2 + 1;
        cnt++;
      }
      
      System.out.println(cnt);
    }
}