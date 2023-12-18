import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] list = new int[M];
        for(int a=0;a<N;a++){
            int k = sc.nextInt();
            for(int b=0;b<k;b++){
                int A = sc.nextInt();
                list[A-1]++;
            }
        }
        int num=0;
        for(int a=0;a<M;a++) if(list[a]==N)num++;
        System.out.println(num);
    }
}
