import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int N;
    int[] L;
    int result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }
        result = 0;
    }

    private void solve() {
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (L[i] == L[j]) {
                    continue;
                }
                for (int k=j+1; k<N; k++) {
                    if (L[i] == L[k] || L[j] == L[k]) {
                        continue;
                    }
                    if (L[i] + L[j] > L[k] && L[i] + L[k] > L[j] && L[j] + L[k] > L[i]) {
                        result++;
                    }
                }    
            }
        }
    }

    private void output() {
        System.out.println(result);
    }
}
