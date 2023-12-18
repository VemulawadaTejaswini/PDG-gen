import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int x = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=a; i<=b; i++){
            if(i % 2 == 0){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}