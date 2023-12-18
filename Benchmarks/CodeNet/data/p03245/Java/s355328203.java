import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][2];
        int mod = 0;
        for(int i=0; i<n; i++){
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
            if(i == 0){
                mod = Math.abs(x[i][0] + x[i][1]) % 2;
            }else{
                if(Math.abs(x[i][0] + x[i][1]) % 2 != mod){
                    System.out.println(-1);
                    return;
                }
            }
        }
        sc.close();

        long[] pow3 = new long[25];
        pow3[0] = 1;
        for(int i=1; i<25; i++){
            pow3[i] = pow3[i-1] * 3;
        }

        int m;
        long[] arm;
        if(mod == 1){
            m = 40;
            arm = new long[m];
            for(int i=0; i<19; i++){
                arm[i*2] = pow3[19 - i];
                arm[i*2+1] = pow3[18-i]*2;
            }
            arm[38] = 1;
            arm[39] = 1;
        }else{
            m = 39;
            arm = new long[m];
            for(int i=0; i<19; i++){
                arm[i*2] = pow3[19-i];
                arm[i*2+1] = pow3[18-i]*2;
            }
            arm[38] = 1;
        }

        // Arrays.fill(arm, 1);

        System.out.println(m);
        for(int i=0; i<m; i++){
            System.out.print(arm[i] + " ");
        }
        System.out.println(arm[m-1]);
        
        for(int i=0; i<n; i++){
            long cx = 0, cy = 0;
            long tx = x[i][0], ty = x[i][1];
            String ans = "";
            for(int j=0; j<m; j++){
                if(Math.abs(tx-cx) > Math.abs(ty-cy)){
                    if(tx > cx){
                        ans += "R";
                        cx += arm[j];       
                    }else{
                        ans += "L";
                        cx -= arm[j];
                    }
                }else{
                    if(ty > cy){
                        ans += "U";
                        cy += arm[j];
                    }else{
                        ans += "D";
                        cy -= arm[j];
                    }
                }
            }
            System.out.println(ans);
            // System.out.println(ans + " " + cx + " " + cy);
        }
    }
}