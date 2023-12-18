import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int[] b = new int[N];
        for(int i=0;i<N;i++){
            b[i]=sc.nextInt();
        }
        int[] result=new int[N];

        for(int i=N-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                if(b[j]==j+1){
                    result[i]=j+1;
                    for(int k=j;k<i;k++){
                        b[k]=b[k+1];
                    }
                    break;
                }
                if(j==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        for(int i=0;i<N;i++){

            System.out.println(result[i]);
        }


    }
}