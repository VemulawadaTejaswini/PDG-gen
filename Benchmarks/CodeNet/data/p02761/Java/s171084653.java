import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=-1;
        }
        for(int i=0;i<m;i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(p[s-1]==-1){
                p[s-1]=c;
            }
            else{
                if(p[s-1]==c)continue;
                System.out.println(-1);
                return;
            }
        }

        if(p[0]==-1)System.out.print(1);
        else if(p[0]==0){
            System.out.print(-1);
            return;
        }
        else System.out.print(p[0]);
        for(int i=1;i<n;i++){
                // System.out.print(p[i]);
            if(p[i]==-1){
                System.out.print(0);

            }
            else{
                System.out.print(p[i]);

            }
        }

    }
}
