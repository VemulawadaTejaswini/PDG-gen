import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] r = new int[n];
        for(int x=0; x < n; x++){
            r[x] = Integer.parseInt(sc.nextLine());
        }
        int maxv = -2000000000;
        int minv = r[0];

        for(int i = 1; i < n; i++){
            maxv = Math.max(maxv, r[i] - minv);
            minv = Math.min(minv, r[i]);
        }
        System.out.println(maxv);

    }
}