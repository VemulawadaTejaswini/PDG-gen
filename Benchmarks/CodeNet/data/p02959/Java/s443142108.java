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
        int result=0;
        for(int i=0;i<N;i++){
            if(A[i]<(kurikosi+B.get(i))){
                result+=A[i];
                kurikosi=Math.min(kurikosi+B.get(i)-A[i],B.get(i));
            }else{
                result+=kurikosi+B.get(i);
                kurikosi=0;
            }
        }
        result+=Math.min(kurikosi,A[A.length-1]);
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
