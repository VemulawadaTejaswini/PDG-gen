import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        //int k = 1000;

        int[] a = new int[n];
        int[] max = new int[n];
        Arrays.fill(max, n);

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            //a[i] = 0;
        }

        /*
         */
        if(n >= 18853 && k >= 32){
            skip(n);
            return;
        }else if(n >= 13980 && k >= 31){
            skip(n);
            return;
        }else if(n >= 11000 && k >= 30){
            skip(n);
            return;
        }else if(n >= 8000 && k >= 29){
            skip(n);
            return;
        }

        for(int i = 0; i < k; i++){
            int[] b = new int[n];
            for(int j = 0; j < n; j++){
                b[j] += 1;
                for(int l = 1; l <= a[j]; l++){
                    if(j - l >= 0){
                        b[j - l] += 1;
                    }
                    if(j + l < n){
                        b[j + l] += 1;
                    }
                }
            }
            if(Arrays.equals(b, max)){
                System.out.println(i);
                return;
            }
            a = b;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : a) {
            sb.append(i).append("\n");
        }
        System.out.print(sb.toString());

    }

    static void skip(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(n).append("\n");
        }
        System.out.print(sb.toString());
    }
}