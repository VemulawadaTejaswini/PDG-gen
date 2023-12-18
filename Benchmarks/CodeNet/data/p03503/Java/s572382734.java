import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] F = new int[N];
        ArrayList<ArrayList<Integer>> P = new ArrayList<>();
        for(int a=0;a<N;a++){
            F[a]=0;
            for(int b=0;b<10;b++){
                int num = sc.nextInt();
                if(num==1)F[a]++;
            }
        }
        for(int a=0;a<N;a++){
            ArrayList<Integer> P2 = new ArrayList<Integer>();
            for(int b=0;b<11;b++){
                int k = sc.nextInt();
                if(b<F[a]+1)P2.add(b,k);
            }
            P.add(P2);
        }

        int min=100000000,max_num_a=0,max_num_b=0,num_a=0,num_b=0;
        int num=0,sum=0;
        for(int a=0;a<N;a++){
            ArrayList<Integer> P3 = new ArrayList<Integer>();
            P3=P.get(a);
            sum += Collections.max(P3);
            if(P3.indexOf(Collections.max(P3))==0) {
                num++;
                num_a = P3.get(0);
                P3.remove(0);
                num_b = Collections.max(P3);
                if(num_a-num_b<min){
                    max_num_a=num_a;
                    max_num_b=num_b;
                }
            }
        }
        if(num==N){
            sum = sum -max_num_a+max_num_b;
        }
        System.out.println(sum);
    }
}