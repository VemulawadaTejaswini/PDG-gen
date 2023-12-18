import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            int Ln[] = new int[N];
            
            for(int i = 0;i < N;i++){
                Ln[i] = sc.nextInt();
            }
            Arrays.sort(Ln);
            int sum = 0;
            for(int i = Ln.length-1;i > Ln.length-K-1;i--){
                sum +=Ln[i];
            }
            System.out.println(sum);

    }
}