import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int friends = Integer.parseInt(sc.next());
        int blocks = Integer.parseInt(sc.next());
        
        int[][] relation = new int[N][N];       //friend =10; candidate = 1
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                relation[i][j] = -1;
            }
            relation[i][i] = 0;
        }
        
        int[] a = new int[friends];
        int[] b = new int[friends];
        for(int t = 0; t < friends; t++) {
            a[t] = Integer.parseInt(sc.next());
            b[t] = Integer.parseInt(sc.next());
            a[t]--;
            b[t]--;
        }
        for(int f = 0; f < 300; f++) {
            for(int t = 0; t < friends; t++) {
                relation[a[t]][b[t]] = 10;
                for(int i = 0; i < N; i++) {
                    if(relation[a[t]][i] > 0) {
                        if(relation[b[t]][i] == -1){
                            relation[b[t]][i] = 1;
                        }
                        if(relation[i][b[t]] == -1){
                            relation[i][b[t]] = 1;
                        }
                    }    
                }
                relation[b[t]][a[t]] = 10;
                for(int i = 0; i < N; i++) {
                    if(relation[b[t]][i] > 0) {
                        if(relation[a[t]][i] == -1){
                            relation[a[t]][i] = 1;
                        }
                        if(relation[i][a[t]] == -1){
                            relation[i][a[t]] = 1;
                        }
                    }    
                }
            }
        }
        
        int c = 0, d = 0;
        for(int t = 0; t < blocks; t++) {
            c = Integer.parseInt(sc.next());
            d = Integer.parseInt(sc.next());
            c--;
            d--;
            relation[c][d] = -10;
            relation[d][c] = -10;
        }  
        
        int count = 0;
        for(int t = 0; t < N; t++) {
            count = 0;
            for(int i = 0; i < N; i++) {
                if(relation[t][i] == 1) {
                    count++;
                }
            }
            System.out.print(count);
            if(t < N-1){
                System.out.print(" ");
            } else {
                System.out.println();
            }
        } 
        
    }
}