import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for(int i=0;i<3;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = Math.abs(A[1]-A[0])+Math.abs(A[2]-A[1]);
        System.out.println(ans);
    }
}
