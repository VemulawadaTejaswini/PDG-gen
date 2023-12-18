import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P = new int[N][3];
        for(int i = 0; i<N; i++){
            P[i][0] = sc.nextInt();
            P[i][1] = sc.nextInt();
            P[i][2] = sc.nextInt();
        }
        sc.close();
        int H =0;
        for(int j = 0; j<101; j++){
            boolean res1 = false;
            for(int k = 0; k <101; k++){
                boolean res2 = true;
                H = 0;
                for(int[] p :P){
                    if(H == 0) {
                        H = p[2] + Math.abs(j - p[0]) + Math.abs(k - p[1]);
                    }else if(H != p[2] + Math.abs(j - p[0]) + Math.abs(k - p[1])){
                        res2 = false;
                        break;
                    }
                }
                if(res2){
                    System.out.println(j + " " + k + " " + H);
                    res1 = true;
                    break;
                }
            }
            if(res1) break;
        }

    }

}
