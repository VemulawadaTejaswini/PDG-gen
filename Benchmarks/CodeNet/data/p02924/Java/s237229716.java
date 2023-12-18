import java.util.*;
class Main{ 
public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int N=scn.nextInt();
        int[] pi=new int[N];
        for (int i = 0; i <N; i++) {
            pi[i]=i;
        }
        int sum=0;
        for(int j=1;j<N-1;j++){
            sum+=(j)/pi[j+1];
        }
        sum+=N;
        System.out.println(sum);
    }
}