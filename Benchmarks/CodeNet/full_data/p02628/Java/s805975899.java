import java.util.Arrays;
import java.util.Scanner;
public class Main {
    int d,j,k,l,o,min;
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int date[] =new int[2];
        for(d=0;d<2;d++) {
            date[d] = sc.nextInt();
        }
        int[] dat=new int[date[0]];
        for(int o=0;o<date[0];o++) {
            dat[o]=sc.nextInt();
        }
        Arrays.sort(dat);
        for(int o=0;o<date[1];o++) {
            min=min+dat[o];

        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        new Main().solve();

    }
}
