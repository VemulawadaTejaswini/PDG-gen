import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String white = ".";
        String black = "#";
        // always let A denote the smaller value
        if(A>B){
            int C = A;
            A = B;
            B = C;
            white = "#";
            black = ".";
        }
        String odd = white+black;
        String even = black+white;
        String divide = white+white;
        String[] dic = new String[]{even,odd};
        int h = 2*B-A;
        int w = 2;
        System.out.println(h+" "+w);
        for(int i=1;i<=A;i++){
            System.out.println(dic[i%2]);
        }
        for(int i=1;i<=(B-A);i++){
            System.out.println(divide);
            System.out.println(odd);
        }




        //System.out.println(ans);
    }
}
