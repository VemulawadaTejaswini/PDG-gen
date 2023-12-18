import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> isGoodMap = new HashMap<>();
        sc.nextLine();
        String[] h = sc.nextLine().split(" ");
        int[] height = new int[h.length];
        int[] isGood = new int[h.length];
        for(int i = 0; i<h.length; i++){
            height[i] = Integer.parseInt(h[i]);
        }
        for(int i = 0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            if(height[a-1] >= height[b-1]){
                isGood[b-1] = 1;
            }else if(height[b-1]>=height[a-1]){
                isGood[a-1] = 1;
            }
        }
        int count = 0;
        for(int i = 0; i<isGood.length;i++){
            if(isGood[i] != 1){
                count++;
            }
        }
        System.out.println(count);

    }
}