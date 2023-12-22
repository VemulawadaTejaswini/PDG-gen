
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = Integer.valueOf(s.next());
        int[] people = new int[N];
        int ans =0;
        Arrays.fill(people, 0);
        for(int i=0;i<N;i++){
            people[i] = s.nextInt();
            
        }
        //parallel
        Arrays.sort(people);
        int maxPoint= N-1;
        int K = people[maxPoint];
        int mod = N%2;
        int counter = (N/2)-1;
        int i=0;
        ans += K;
        for(;i<counter;i++ ){
            ans += 2*(people[maxPoint-i-1]);
        }
        if(mod !=0){
            ans += people[maxPoint-i-1];
        }
        System.out.println(ans);
        //部下持ち数
        /* int hoge=N-K+2;
		for(int i = K; i <= N+1; i++) {
            for(int i2 =0; i2<= i-1;i2++){
                hoge += N-(2*i2);50
            }
        } */

        

    }
}
    


    