import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(); int w = sc.nextInt();
            if(n==0 && w==0) break;

            int max = 0;
            int[] list = new int[n];
            for(int i=0; i<n; i++){
                list[i] = sc.nextInt();
                max = Math.max(max, list[i]);
            }
            int a = max/w + 1;
            int[] his = new int[a];
            for(int i=0; i<n; i++) his[list[i]/w]++;
            int highest = 0;
            for(int i=0; i<a; i++) highest = Math.max(highest, his[i]);

            double sum = 0.0;
            for(int i=0; i<a; i++){
                sum += (double)(a-i-1)/(a-1) * (double)his[i]/highest;
            }
            sum += 0.01;
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}