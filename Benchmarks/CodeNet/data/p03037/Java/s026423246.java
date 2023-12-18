import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int left = 1;
        int right = N;
        for(int i=0;i<M;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(L > left)left=L;
            if(R < right)right=R;
        }
        if(right < left){
            System.out.println(0);
        }
        else{
            System.out.println(right-left+1);
        }
    }
}