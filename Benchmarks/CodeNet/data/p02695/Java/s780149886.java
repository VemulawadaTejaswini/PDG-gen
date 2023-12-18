import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[][] abcd = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            abcd[i][0] = scanner.nextInt()-1;
            abcd[i][1] = scanner.nextInt()-1;
            abcd[i][2] = scanner.nextInt();
            abcd[i][3] = scanner.nextInt();
        }

        ArrayList<ArrayList<Integer>> As = new ArrayList<>();
        for(int i=1; i<=M; i++){
            ArrayList<Integer> A = new ArrayList<>();
            A.add(i);
            step(As, A, M, N); 
        }
        int ans = 0;
        for(int i=0; i<As.size(); i++){
            int score = 0;
            ArrayList<Integer> A = As.get(i);
            // System.out.println(A);
            for(int j=0; j<Q; j++){
                if( (A.get(abcd[j][1]) - A.get(abcd[j][0])) == abcd[j][2]){
                    score += abcd[j][3];
                }
            }
            // System.out.println(score);
            ans = Math.max(ans,score);
        }
        System.out.println(ans);
    }
    public static void step(ArrayList<ArrayList<Integer>> As, ArrayList<Integer> A, int M, int N){
        if(A.size() >= N){
            ArrayList<Integer> ac = new ArrayList<Integer>(A);
            As.add(ac);
            return;
        }else{
            int last = A.get(A.size()-1);
            for(int i=last; i<=M; i++){
                ArrayList<Integer> ac = new ArrayList<Integer>(A);
                ac.add(i);
                step(As,ac,M,N);
            }
        }
    }
}