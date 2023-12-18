import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }
        Collections.sort(list);

        int x;
        if(N%2==0){
            x = 1;
        }
        else{
            if(list.get(0)!=0){
                System.out.println(0);
                return;
            }
            if(N==1 && list.get(0)==0){
                System.out.println(1);
            }
            x = 2;
        }
        int ans = 1;
        for(int i=x; i<N; i=i+2){
            if(list.get(i)!=i || list.get(i-1)!=i){
                System.out.println(0);
                break;
            }
            if(i==N-1){
                for(int j=0; j<N/2; j++){
                    ans = ans * 2 % 1000000003;
                }
                System.out.println(ans);
            }
        }
    }
}