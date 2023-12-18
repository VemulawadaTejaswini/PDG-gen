import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        if(N % 1.08 == 0){
            System.out.println((int)(N / 1.08));
            return;
        }
        for(int i =(int) (N / 1.08); i <= N; i++){
            if((int) (i * 1.08) == N){
                System.out.println((int) i);
                return;
            }
        }
        System.out.println(":(");
    }
}
