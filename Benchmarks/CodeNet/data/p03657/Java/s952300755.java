import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //棒の全体数
    int K = sc.nextInt(); //取る棒の本数
    int[] rodList = new int[55];
    int rodSum = 0;
    for(int i=0; i < N; i++){
      rodList[i] = sc.nextInt();  
    }
    
    Arrays.sort(rodlist);

    for(int i = 0; i < K; i++){
      rodSum += rodList[i];
    }
   System.out.println(rodSum); 
  }
}
