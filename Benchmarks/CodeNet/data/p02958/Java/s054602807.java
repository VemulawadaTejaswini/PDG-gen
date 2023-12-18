import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt();
        }
        sc.close();

        int flg1 = 0;
        for(int i=0;i<N-1;i++){
            if(P[i]!=P[i+1]-1){
                flg1=flg1+1;
             }
        }
        if(flg1==2||flg1==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}