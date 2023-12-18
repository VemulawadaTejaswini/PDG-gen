import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] V = new int[20];
        int[] C = new int[20];
        

        for (int i = 0; i < N; i++){
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++){
            C[i] = sc.nextInt();
        }

        int answer = 0;
        for(int i=0; i<N; i++){
            if (V[i] > C[i]){
                answer += V[i]-C[i];
            }
        }

        System.out.println(answer);
    }
}

