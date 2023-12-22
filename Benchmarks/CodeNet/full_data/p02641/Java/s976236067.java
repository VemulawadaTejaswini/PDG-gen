import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i<n; i++){
            p[i] = sc.nextInt();
        }

        int ans = -100000000;
        int ansLow, ansHigh;
        int count = 0;
        int matchNotAns = -1000000000;

        for(int j = 0; j<1000; j++){
            for(int k = 0; k<n; k++){
                if(x - j == p[k]){
                    count++;
                    matchNotAns = p[k];
                }
                else if(x + j == p[k]){
                    count++;
                    matchNotAns = p[k];
                }
            }
            if(count == 1 && j!=0){
                if(matchNotAns == x - j){
                    ans = x + j;
                }
                else if(matchNotAns == x + j){
                    ans = x - j;
                }
                break;
            }
            else if(count == 0){
                ans = x - j;
                break;
            }
            count = 0;
        }
        System.out.println(ans);
    }
}