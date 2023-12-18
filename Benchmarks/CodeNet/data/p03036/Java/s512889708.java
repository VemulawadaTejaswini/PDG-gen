import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        for(int i = 0; i < 10; i++){
            ans = r * x - d;
            System.out.println(ans);
            //次の繰り返し処理でXi+1にするためのもの
            x = ans;
        }
    }
}