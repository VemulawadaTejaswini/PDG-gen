import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tall[] = new int[n+1];
        boolean ch[] = new boolean[n+1];
        int count = 0;

        for(int i = 1 ; i <= n; i++) tall[i] = scan.nextInt();
        scan.close();

        for(int i = 1; i <= n - 2; i++){
            int p = tall[i];
            if(i + p + 1 > n) continue;
            if(i + p + 1 <= n){
                for(int j = i+p+1; j <= n; j++){
                    if(Math.abs(i-j) == tall[i] + tall[j]) count++;
                }
            }
        }

        System.out.println(count);


    }
}