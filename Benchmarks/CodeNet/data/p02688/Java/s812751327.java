import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;

        boolean snk[] = new boolean[n+1];

        for(int i = 1; i < n + 1; i++){
            snk[i] = false;
        }

        for(int i = 0;i < k;i++){
            int treat = scan.nextInt();
            for(int j = 0; j < treat; j++){
                int g = scan.nextInt();
                if(!snk[g]) snk[g] = true;
            }
        }

        scan.close();
        for(int i = 1; i < n + 1; i++){
            if(!snk[i]) count++;
        }

        System.out.println(count);

        
    }
}