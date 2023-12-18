import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        boolean[][] lampToSwitch = new boolean[m][n];
        for(int i=0; i<m; i++){
            int k = stdIn.nextInt();
            for(int j=0; j<k; j++){
                int s = stdIn.nextInt();
                lampToSwitch[i][s-1] = true;
            }
        }

        int[] surplus = new int[m];
        for(int i=0; i<m; i++){
            surplus[i] = stdIn.nextInt();
        }

        boolean[] bit = new boolean[n+1];
        int ans = 0;
        do{
            boolean clearFlag = true;
            for(int i=0; i<m; i++){
                int onSwitches = 0;
                for(int j=0; j<n; j++){
                    if(lampToSwitch[i][j]){
                        if(bit[j]){
                            onSwitches++;
                        }
                    }
                }
                if(onSwitches % 2 != surplus[i]){
                    clearFlag = false;
                    break;
                }
            }

            if(clearFlag){
                ans++;
            }

            changeBit(bit);
        }while(!finish(bit));

        System.out.println(ans);
    }

    static void changeBit(boolean[] bit){
        boolean carryBit = true;
        for(int i=0; i<bit.length; i++){
            if(carryBit){
                if(bit[i]){
                    bit[i] = false;
                }else{
                    bit[i] = true;
                    carryBit = false;
                }
            }
        }
    }

    static boolean finish(boolean[] bit){
        return bit[bit.length-1];
    }
}