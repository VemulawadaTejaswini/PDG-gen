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
            Arrays.sort(Ln, Comparator.reverseOrder());
            for(int i = 0;i < N;i++){
                System.out.println(Ln[i]);
            }

    }
}