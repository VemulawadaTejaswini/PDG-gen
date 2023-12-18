import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        List<Integer> c = new ArrayList<>();
        int memo1 = 0;
        int memo2 = 0;
        int ans = 0; 

        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A,Collections.reverseOrder());

        for(int i = 0;i < N;i++){
            for(int j = A[i];j > 0;j--){
                if(A[i] % j == 0){
                    c.add(j);
                }
            }
        }

        Collections.sort(c,Collections.reverseOrder());
        for(int i = 0;i < c.size();i++){
            memo1 = c.get(i);
            if(memo1 == c.get(i+1)){
                memo2 = c.get(i+1);
                ans++;
                if(ans+1 == N){
                    break;
                }else if((memo2 != c.get(i+2)) && ans+1 == N-1){
                    break;
                }
        }
        memo1 = 1;
    }
    System.out.println(memo1);
    }
}