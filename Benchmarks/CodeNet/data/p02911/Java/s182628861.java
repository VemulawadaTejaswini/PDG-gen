import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] point = new int[n];
        Arrays.fill(point, k - q);
        for(int i = 0;i < q;i++){
            point[Integer.parseInt(sc.next()) - 1]++;
        }
        for(int i = 0;i < n;i++){
            if(point[i] >= 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}