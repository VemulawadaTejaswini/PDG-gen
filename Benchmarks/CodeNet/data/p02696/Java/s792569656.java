import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	Long a = sc.nextLong();
    Long b = sc.nextLong();
    Long n = sc.nextLong();
    Long max = 0L;
    for(Long i = 1L; i < n; i++){
      Long ans = a*i/b - a*(i/b);
      if(ans > max) max =ans;
    }
    System.out.println(max);
  }
}
