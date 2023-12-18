import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

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

        int ans = 0;
        int x = 0;
        for(int i=0; i<N-1; i++){
            x += 1;
            if(list.get(i)!=list.get(i+1)){
                if(x%2!=0){
                    ans += 1;
                }
                x = 0;
            }
        }
        x++;
        if(x%2!=0){
            ans += 1;
        }
        System.out.println(ans);
    }
}