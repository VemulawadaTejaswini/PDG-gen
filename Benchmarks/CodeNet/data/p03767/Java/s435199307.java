import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    long[] scoreList = new long[N*3];
    for(int i =0; i < N*3; i++)
      scoreList[i] = sc.nextLong();
    
    Arrays.sort(scoreList);
    
    for(int i = 0; i < N; i++){
        int s = N * 3 - (1 + 2 * i);
    	sum += scoreList[s];
    }
    System.out.println(sum); 
  }
}
