import java.util.Scanner;

public class Main {
    final double eps = 0.000000001;
    void run() {
        Scanner sc = new Scanner(System.in);
        int x,y,s,max;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            s = sc.nextInt();
            max = 0;
            if(x+y+s == 0) break;
            for(int i = 1; i <= s/2; i++){
                int s1 = i;
                int s2 = s-i;
                int ps1 = getNoTaxPrice(s1, x);
                int ps2 = getNoTaxPrice(s2, x);
                int ys1 = (int) Math.floor(ps1 * ((100.0+y)/100.0) + eps);
                int ys2 = (int) Math.floor(ps2 * ((100.0+y)/100.0) + eps);
                max = Math.max(max, ys1+ys2);
            }
            System.out.println(max);
        }
    }
    /*
     * 税抜き価格を返します
     * 
     * 税抜き価格は必ず税込価格以下なので
     * sから1つずつ試して、再度税込価格を計算し、元の税込価格を等しかったら返す
     */
    int getNoTaxPrice(int s,int x){
        for(int i = s; 0 < i; i--){
            int temp = (int) Math.floor(i * ((100.0+x)/100.0) + + eps);
            if(temp == s){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //new AOJ1192().run();
        new Main().run();
    }
}