import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int x = stdIn.nextInt();

        int[] c = new int[n];
        int[][] a = new int[n][m];

        for(int i=0; i<n; i++){
            c[i] = stdIn.nextInt();
            for(int j=0; j<m; j++){
                a[i][j] = stdIn.nextInt();
            }
        }

        boolean[] bit = new boolean[n+1];

        int minCost = Integer.MAX_VALUE;
        while(!bit[n]){
            int sumCost = 0;
            int[] skills = new int[m];
            for(int i=0; i<n; i++){
                if(bit[i]){
                    for(int j=0; j<m; j++){
                        skills[j] += a[i][j];
                    }
                    sumCost += c[i];
                }
            }

            if(clear(skills, x)){
                if(sumCost < minCost){
                    minCost = sumCost;
                }
            }

            setNextBit(bit);
        }

        if(minCost < Integer.MAX_VALUE){
            System.out.println(minCost);
        }else{
            System.out.println(-1);
        }
    }

    static boolean clear(int[] skills, int x){
        for(int i=0; i<skills.length; i++){
            if(skills[i] < x){
                return false;
            }
        }
        return true;
    }

    static void setNextBit(boolean[] bit){
        for(int i=0; i<bit.length; i++){
            bit[i] = (bit[i]) ? false : true;
            if(bit[i]){
                return;
            }
        }
    }
}