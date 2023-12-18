import java.util.*;
import java.util.List;
import java.util.ArrayList;

class test{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n>=m){
            System.out.println(0);
        }
        int[] arr = new int[m];
        for (int i=0; i<m; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(arr);
        List<Integer> score = new ArrayList<>();
        for (int i=0; i<m-1; i++){
            score.add(arr[i+1] - arr[i]);
        }
        Collections.sort(score);
        int ans = 0;
        for (int i=0; i<m-n; i++){
            ans += score.get(i);
        }
        System.out.println(ans);
    }
}