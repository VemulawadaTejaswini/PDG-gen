import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count = 0;
        for(int i = 0; i < N; ++i){
            for(int j = i+1; j < N; ++j){
                if(i<j){
                    count += 1;
                }
            }
        }
    }
}
