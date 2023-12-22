import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            a += sc.nextInt();
            b += sc.nextInt();
            c += sc.nextInt();

            if(a==0 && b==0 && c==0) break;

            int max = 0;
            for(int i=0; i<=a; i+=3){
                for(int j=0; j<=b; j+=3){
                    for(int k=0; k<=c; k+=3){
                        int num = Math.min(a-i,Math.min(b-j,c-k));
                        max = Math.max(max, i/3+j/3+k/3+num);
                    }
                }
            }

            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}