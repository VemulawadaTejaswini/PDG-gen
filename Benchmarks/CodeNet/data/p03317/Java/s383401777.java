import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int min = 999999999;
        int num = 999999999;
        int opt=0;
        for(int i=0;i<N;i++){
            int n = sc.nextInt();
            List.add(n);
            if(min>n){
                min = n;
                num = i+1;
            }
        }
        if(num!=N){
            if(N-num+1>K) opt+=(N-num+1)/(K-1);
            else if(N-num+1<=K) opt+=1;
        }
        if(num!=0){
            if(num>K) opt+=(num)/(K-1);
            else if(num<=K)opt+=1;
        }
        System.out.println(opt);
    }
}