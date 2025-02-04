import java.util.*;

public class Main{

    int m,n;
    String[] FizzBuzz = new String[10000];

    void solve(){
        Scanner sc = new Scanner(System.in);

        getFizzBuzz();

        while(true){
            m = sc.nextInt();
            n = sc.nextInt();
            if(m==0 && n==0) break;

            int[] player = new int[m];
            int num = m;

            int idx = 0;
            for(int i=0; i<n; i++){
                String s = sc.next();
                if(!s.equals(FizzBuzz[i])){
                    while(player[idx]!=0) idx = (++idx)%m;
                    player[idx] = -1;
                    num--;
                    if(num==1){
                        for(int j=i+1; j<n; j++) s = sc.next();
                        break;
                    }
                }
                idx = (++idx)%m;
            }

            idx = 0;
            int[] ans = new int[num];
            for(int i=0; i<m; i++){
                if(player[i]==0){
                    ans[idx] = i+1;
                    idx++;
                }
            }

            for(int i=0; i<num-1; i++) System.out.print(ans[i]+" ");
            System.out.println(ans[num-1]);

        }
    }

    void getFizzBuzz(){
        for(int i=1; i<=10000; i++){
            if(i%3==0 && i%5==0) FizzBuzz[i-1] = "FizzBuzz";
            else if(i%5==0) FizzBuzz[i-1] = "Buzz";
            else if (i%3==0) FizzBuzz[i-1] = "Fizz";
            else FizzBuzz[i-1] = String.valueOf(i);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}