import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        Set<Integer> du = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int curr =sc.nextInt();
            if(!set.contains(curr) && !du.contains(curr)){
                set.add(curr);
            }else{
                set.remove(curr);
                du.add(curr);
            }
        }
        int[] arr = new int[set.size()];
        int idx = 0;
        for(int s : set){
            arr[idx++] = s;
        }
        int res = arr.length > 0 ? 1 : 0;
        i: for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] % arr[j] == 0)
                    continue i;
            }
            res++;
        }
        System.out.println(res);
    }
}