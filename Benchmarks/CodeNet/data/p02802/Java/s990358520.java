import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] cleared = new boolean[n];
        int[] penalties = new int[n];
        int clearedQuestions = 0;

        boolean ac; int q;
        for(int i=0; i<m; i++){
            q = sc.nextInt()-1;
            ac = sc.next().equals("AC");
            if(cleared[q]) continue;
            if(ac){
                cleared[q] = true;
                clearedQuestions++;
            }else{
                penalties[q]++;
            }
        }

        int penalty = 0;
        for(int i=0; i<n; i++){
            penalty += cleared[i] ? penalties[i] : 0;
        }

        System.out.println(clearedQuestions+" "+penalty);
    }
}