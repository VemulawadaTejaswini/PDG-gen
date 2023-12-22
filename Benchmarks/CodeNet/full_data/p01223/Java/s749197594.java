import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max1 = 0, max2 = 0;
            int before = sc.nextInt();
            for(int i=1; i<n; i++){
                int num = sc.nextInt();
                max1 = Math.max(max1, num - before);
                max2 = Math.max(max2, before - num);
                before = num;
            }
            System.out.println(max1+" "+max2);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}