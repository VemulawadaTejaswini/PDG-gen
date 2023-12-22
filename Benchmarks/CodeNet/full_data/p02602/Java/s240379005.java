import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long [] score= new long[N];
    long sumScore = 1;
    for(int i=0; i< N; i++) {
    	score[i] = sc.nextLong();
    	if(i < K) sumScore *= score[i];
    }
    int j = 0;
    for(int i = K; i < N; i++) {
    	long beforeScore = sumScore;
    	sumScore /= score[j];
    	j++;
    	sumScore *= score[i];
    	if(sumScore > beforeScore) System.out.println("Yes");
    	else System.out.println("No");
    }
    sc.close();
  }
}