import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int A[] = new int[N];
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int ans =0;
        int tmp=0;
        for (int i =0;i<N;i++){
            for (int j=0; j<N;j++){
                if (j ==i){
                    continue;
                }
                ans +=Math.abs(tmp-A[j]);
                tmp =A[j];
            }
            ans +=Math.abs(tmp);
            System.out.println(ans);
            ans=0;
            tmp=0;
        }
    }
}
