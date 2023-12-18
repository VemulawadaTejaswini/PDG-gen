import java.util.*;
public class Main {
    static boolean[] f  = new boolean[100001];
    //素数判定


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        /*int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i=0;i<Q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] answer = new int[Q];*/
        f[0] = f[1]=true;
        for(int i=2;i<=100000;i++){
            if(!f[i]){
                for(int j=i*2;j<=100000;j=j+i){
                    f[j] = true;
                }
            }
        }
        int[] c = new int[100002];
        c[0] = 0;
        c[1] = 0;
        c[2] = 0;
        for(int i=3;i<=100000;i+=2){
            if(!f[i]&&!f[(i+1)/2]) c[i]++;
        }
        for(int i=3;i<=100000;i++) c[i] += c[i-1];

        for(int i=0;i<Q;i++){/*
            int p = l[i] + 1;
            int q = r[i] + 1;
            p = p/2;
            q = q/2;
            for(int j=p;j<=q;j++){
                if(f[j]==false && f[2*j-1]==false) {
                    answer[i]++;
                }
            }
            System.out.println(answer[i]);*/
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(c[q]-c[p-1]);
        }



    }

}
