import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        int max = sc.nextInt();
        int min = 0;
        
        for(int i = 0;i < n-1;i++){
            int p = sc.nextInt();
            if(i == 0){
                min = p;
                if(max < min){
                    int tmp = min;
                    min = max;
                    max = tmp;
                }
            }

            if(max >= p && min >= p){
                ans++;
            }
            if(p > max)
                max = p;
            if(p < min)
                min = p;
        }
        
        System.out.println(ans);
    }
}