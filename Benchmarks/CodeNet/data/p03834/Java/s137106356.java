import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int count = 0;
    
    //K以下の自然数X,Y,Zの合計がSとなる組み合わせは何通りあるか
    for(int x = 0; x <=K; x++){
      for(int y = 0; y <=K; y++){
        int z = S - (x + y);
        if(z <= K) count++;
      }
    }   
    System.out.println(count);      
  }
}
