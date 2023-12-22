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
            for(int i=0; i*3<=a; i++){
                for(int j=0; j*3<=b; j++){
                    for(int k=0; k*3<=c; k++){
                        for(int l=0; ; l++){
                            if(l+i*3>a || l+j*3>b || l+k*3>c) break;
                            max = Math.max(max, i+j+k+l);
                        }
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