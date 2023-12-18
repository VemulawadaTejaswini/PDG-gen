import java.util.*;
public class Main {
    public static boolean[] prime = new boolean[100000];

    //素数判定
    public static boolean istrue(int x){
        if(prime[x]==true) return true;
        if(x==1) return false;
        if(x==2) return true;
        if(x==3) return true;
        int count = 0;
        if(x%2==0) return false;
        for(int i=2;i<x;i++){
            if(x%i==0) count++;
            if(count>=1){
                return false;
            }
        }
        prime[x] = true;
        for(int j=2;j<=100000;j = j * x){
            prime[j*x] = false;
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i=0;i<Q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] answer = new int[Q];


        for(int i=0;i<Q;i++){
            int p = l[i] + 1;
            int q = r[i] + 1;
            p = p/2;
            q = q/2;
            for(int j=p;j<=q;j++){
                if(istrue(j)==true){
                    if(istrue(2*j-1)==true){
                        answer[i]++;
                    }
                }
            }
            System.out.println(answer[i]);
        }



    }

}
