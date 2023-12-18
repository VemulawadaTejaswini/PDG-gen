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
        int count1;
        int count2;
        for(int i=-K+1;i<K;i++){
            for(int j=-K+1;j<K;j++) {
                count1=1;
                count2=0;
                int bx=x[0]-i;
                int by=y[0]-j;
                for(int a=1;a<N;a++){
                    int rex=x[a]-bx;
                    int rey=y[a]-by;

                    int qx = (rex/K)%2;
                    int qy = (rey/K)%2;

                    if(qx==0 && qy==0){
                        if(c[0]==c[a])count1++;
                        else count2++;
                    } else if(qx==0 && qy==1){
                        if(c[0]!=c[a])count1++;
                        else count2++;
                    } else if(qx==1 && qy==0){
                        if(c[0]!=c[a])count1++;
                        else count2++;
                    } else if(qx==1 && qy==1){
                        if(c[0]==c[a])count1++;
                        else count2++;
                    }

                }
                max=Math.max(max,count1);
                max=Math.max(max,count2);
            }
        }

        System.out.println(max);

    }
}
