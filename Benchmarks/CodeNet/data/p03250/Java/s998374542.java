import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for(int i=0;i<3;i++) A[i]=sc.nextInt();
        Arrays.sort(A);
        int ans = A[2]*10+A[1]+A[0];
        System.out.println(ans);
    }
}
