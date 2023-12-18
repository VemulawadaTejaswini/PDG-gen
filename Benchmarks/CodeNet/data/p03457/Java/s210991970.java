import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] t = new int[N+1];
        t[0] = 0;
        int x = 0;
        int y = 0;
        int X;
        int Y;
        String ans = "Yes";
        
        for(int i = 1; i <= N; i++){
            t[i] = Integer.parseInt(sc.next());
            X = Integer.parseInt(sc.next());
            Y = Integer.parseInt(sc.next());
            if(X + Y > x + y + t[i] - t[i-1]) {
                ans = "No";
                break;
            }else if(X + Y == x + y + t[i] - t[i-1]) {
                x = X;
                y = Y;
            }else {
                if((x + y + t[i] - t[i-1] - X - Y) % 2 == 0) {
                    x = X;
                    y = Y;
                }else {
                    ans = "No";
                    break;
                }
            }
        } 
        
        System.out.println(ans);
        
        
    }
}