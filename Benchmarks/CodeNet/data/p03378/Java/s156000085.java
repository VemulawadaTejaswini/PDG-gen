import java.util.*;

import sun.jvm.hotspot.utilities.IntArray;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        boolean[] payCost = new boolean[n+1];
        int ans = 0;
        int c2 = 0;
        int left = 0;
        int right = 0;
        List<Integer> cost = new ArrayList<>();

        for(int i = 1;i < m;i++){
            cost.add(sc.nextInt());
        }
        for(int i = 0;i < n+1;i++){
            if(i == cost.get(c2)){
                payCost[i] = true;
                c2++;
            }
        }
        for(int i = 0;i < n+1;i++){
            if(i <= x && payCost[i]){
                left++;
            }
            if(i >= x && payCost[i]){
                right++;
            }
        }
        ans = Math.min(left,right);
        System.out.println(ans);
    }
}