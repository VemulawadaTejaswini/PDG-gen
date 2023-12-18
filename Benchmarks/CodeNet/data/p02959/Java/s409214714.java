import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int[] A=new int[N+1];
        ArrayList<Integer>B=new ArrayList<>(N);
        for(int i=0;i<N+1;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B.add(sc.nextInt());
        }
        int kurikosi=0;
        long result=0;
        for(int i=0;i<N;i++){
                result+=Math.min(A[i],kurikosi+B.get(i));
                kurikosi=Math.max(0,Math.min(kurikosi+B.get(i)-A[i],B.get(i)));
        }
        result+=Math.min(kurikosi,A[N]);
        System.out.println(result);







    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
