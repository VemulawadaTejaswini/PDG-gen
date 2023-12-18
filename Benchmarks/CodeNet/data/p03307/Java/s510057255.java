import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int max = x;
    int min = x;
    for(int i=1; i<N; i++){
      x = sc.nextInt();
        if(x > max) { max = x;}
        if(x < min) { min = x;}
    }
    System.out.println(max - min);
  }
}
