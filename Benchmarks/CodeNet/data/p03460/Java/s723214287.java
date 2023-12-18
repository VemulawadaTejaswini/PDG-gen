import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N,K;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        char[] c = new char[N];

        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            c[i]=sc.next().charAt(0);
        }

        int max=0;
        int count=0;
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                count=1;
                int bx=x[0]-i;
                int by=y[0]-j;
                for(int a=1;a<N;a++){
                    int sx=Math.abs(x[a]-bx);
                    int sy=Math.abs(y[a]-by);

                    int qx=sx/K;
                    int qy=sy/K;

                    int samex,samey;
                    if(qx%2==0){
                        samex=1;
                    }else{
                        samex=-1;
                    }
                    if(qy%2==0){
                        samey=1;
                    }else{
                        samey=-1;
                    }

                    if(samex*samey>0){
                        if(c[0]==c[a])count++;
                    }else{
                        if(c[0]!=c[a])count++;
                    }
                }
            }
            if(count > max)max=count;
            for(int j=0;j<K;j++) {
                count = 0;
                int bx = x[0] - i;
                int by = y[0] - j;
                for (int a = 1; a < N; a++) {
                    int sx = Math.abs(x[a] - bx);
                    int sy = Math.abs(y[a] - by);

                    int qx = sx / K;
                    int qy = sy / K;

                    int samex, samey;
                    if (qx % 2 == 0) {
                        samex = 1;
                    } else {
                        samex = -1;
                    }
                    if (qy % 2 == 0) {
                        samey = 1;
                    } else {
                        samey = -1;
                    }

                    if (samex * samey > 0) {
                        if (c[0] != c[a]) count++;
                    } else {
                        if (c[0] == c[a]) count++;
                    }
                    if (count <= max) break;
                }
            }
            if(count > max)max=count;
        }

        System.out.println(max);



    }
}