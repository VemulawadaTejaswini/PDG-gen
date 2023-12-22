import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int n[] = new int[N];
    for(int i = 0; i < N; i++){
      n[i] = sc.nextInt();
    }
    long last, sum;
    last = -1;
    sum = 0;
    for(int i = 0; i < N; i++){
	  if(last > n[i]){
        sum += (last - n[i]);
      } else {
        last = n[i];
      }
    }
    System.out.println(sum);
  }
}