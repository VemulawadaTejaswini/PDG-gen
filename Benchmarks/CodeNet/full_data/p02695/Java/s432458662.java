import java.util.Scanner;

public class Main{
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        tuple[] tup = new tuple[q];

        for(int i=0; i<q; i++){
            tup[i] = new tuple(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        
        int[] seq = new int[n+1];
        seq[0] = 1;
        sum = 0;
        gene(1, n, m, seq, tup, q);
        System.out.println(sum);

        sc.close();

    }
    static int eval(int[] seq, tuple[] tup, int q) {
        int score = 0;
        for(int i=0; i < q; i++){
            if((seq[tup[i].b]-seq[tup[i].a])==tup[i].c) score += tup[i].d;
        }
        return score;
    }
    static void gene(int i, int n, int m, int[] seq, tuple[] tup, int q){
        if(i==n+1){
            int temp = eval(seq, tup, q);
            sum = Math.max(sum, temp);
            return;
        }
        for(int j=seq[i-1]; j<=m; j++){
            seq[i] = j;
            gene(i+1, n, m, seq, tup, q);
        }
    }
    static class tuple{
        int a;
        int b;
        int c;
        int d;
        tuple(int a, int b, int c, int d){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}