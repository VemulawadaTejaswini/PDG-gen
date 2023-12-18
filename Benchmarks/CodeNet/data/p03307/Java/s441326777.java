import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N];
    for(int i=0; i<N; i++)
      x[i] = sc.nextInt();
    int max = x[0];
    int min = x[0];
    for(int i = 1; i < x.length; i++){
      if(x[i] > max) max = x[i];
      if(x[i] < min) min = x[i];
    }
    System.out.println(max - min);
  }
}