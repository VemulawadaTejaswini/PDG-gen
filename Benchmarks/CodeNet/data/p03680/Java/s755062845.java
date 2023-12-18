import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        int[] button = new int[N+1];
        boolean[] isLighting = new boolean[N+1];
        for(int i=1; i<=N; i++){
            button[i] = Integer.parseInt(sc.next());
        }
        
        
        int num = 1;
        int ans = 0;
        while(true){
            if(isLighting[num] == true){
                System.out.println(-1);
                break;
            }else{
                isLighting[num] = true;
                num = button[num];
                ans++;
                if(num == 2){
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}