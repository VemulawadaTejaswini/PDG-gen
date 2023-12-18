import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i=0; i<n; i++){
            v[i]  = sc.nextInt();
        }
        sc.close();

        int[] num1 = new int[100010];
        int[] num2 = new int[100010];

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                num1[v[i]]++;
            }else{
                num2[v[i]]++;
            }
        }

        int max11 = 0;
        int max12 = 0;
        int max21 = 0;
        int max22 = 0;
        int pos1 = 0;
        int pos2 = 0;

        for(int i=0; i<100010; i++){
            if(num1[i] > max11){
                max12 = max11;
                max11 = num1[i];
                pos1 = i;
            }else if(num1[i] > max12){
                max12 = num1[i];
            }
            if(num2[i] > max21){
                max22 = max21;
                max21 = num2[i];
                pos2 = i;
            }else if(num2[i] > max22){
                max22 = num2[i];
            }
        }

        if(pos1 != pos2){
            System.out.println(n - max11 - max21);
        }else{
            int ans = Math.max(max11 + max22, max12 + max21);
            System.out.println(ans);
        }

    }
}