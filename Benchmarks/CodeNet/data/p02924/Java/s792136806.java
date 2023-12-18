import java.util.*;
class Main{ 
public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int N=scn.nextInt();
        int[] Pi=new int[N];
        for (int i = 0; i <N; i++) {
            pi[i]=i;
        }
        int sum=0;
        for(int j=0;j<N-1;j++){
            sum+=j/pi[j+1];
        }
        system.out.println(sum);
    }
}