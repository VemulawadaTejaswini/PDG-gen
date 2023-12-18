import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int max = 0;
    for(int i = 1; i <= n; i++){
      int ans = a*i/b - a*(i/b);
      if(ans > max) max =ans;
    }
    System.out.println(max);
  }
}