import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        int max = sc.nextInt();
        for(int i = 0;i < n-1;i++){
            int p = sc.nextInt();
            if(max >= p){
                ans++;
            }else{
                max = p;
            }
        }
        
        System.out.println(ans);
    }
}