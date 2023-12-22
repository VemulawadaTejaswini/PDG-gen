import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main{
    static double before[][];
    static double after[][];
    static boolean souko[][];
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                int n = Integer.parseInt(br.readLine());
                if(n == 0) return;
 
                String strs[] = br.readLine().split(" ");
                char s = strs[0].charAt(0);
                char t = strs[1].charAt(0);
                char b = strs[2].charAt(0);
 
                before = new double[3][3];
                souko = new boolean[3][3];
 
                int bs[] = charToInts(b);
                souko[bs[0]][bs[1]] = true;
 
                int ss[] = charToInts(s);
                before[ss[0]][ss[1]] = 1.0;
 
                for(int i = 0; i < n; i++){
                    after = new double[3][3];
                    calc();
                    before = after;
                }
 
                int ts[] = charToInts(t);
                System.out.println(before[ts[0]][ts[1]]);
            }
        }catch(Exception e){
        }
    }
 
    static void calc(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                double p = before[i][j] * 0.25;
                // ←
                if(j == 0 || souko[i][j-1]){
                    after[i][j] += p;
                }else{
                    after[i][j-1] += p;
                }
 
                // ↑
                if(i == 0 || souko[i-1][j]){
                    after[i][j] += p;
                }else{
                    after[i-1][j] += p;
                }
 
                // →
                if(j == 2 || souko[i][j+1]){
                    after[i][j] += p;
                }else{
                    after[i][j+1] += p;
                }
 
                // ↓
                if(i == 2 || souko[i+1][j]){
                    after[i][j] += p;
                }else{
                    after[i+1][j] += p;
                }
            }
        }
    }
 
    static int[] charToInts(char c){
        int m = c - 'A';
        int result[] = {m / 3, m % 3};
        return result;
    }
}