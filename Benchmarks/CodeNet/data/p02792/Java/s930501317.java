import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] count = new int[10][10];
        int base = 1;
        for(int i=1; i<=N; i++){
            int last = i % 10;
            if(base * 10 <= i){ base = base * 10; }
            int first = i/base;
            count[first][last] ++;
        }
        int res = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(i==0 || j==0){
                    res = res + 0;
                } else {
                    res = res + count[i][j] * count[j][i];
                } 
            }
        }
        System.out.println(res);
    }
}