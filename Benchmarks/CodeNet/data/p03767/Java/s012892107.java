import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    long[] scoreList = new long[N*3 +100];
    for(int i =0; i < N*3; i++)
      scoreList[i] = sc.nextLong();
    
    Arrays.sort(scoreList);
    for(i = N; i < N*2; i++){
      sum += scoreList[i];
    }   
    System.out.println(scoreList); 
  }
}
