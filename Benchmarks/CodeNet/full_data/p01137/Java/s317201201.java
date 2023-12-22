import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int e = sc.nextInt();
            if(e==0) break;

            int m = Integer.MAX_VALUE;
            for(int i=0; i*i*i<=e; i++){
                int z = i*i*i;
                for(int j=0; j*j+z<=e; j++){
                    int y = j*j;
                    for(int k=0; k+z+y<=e; k++){
                        if(z+y+k==e){
                            m = Math.min(m,i+j+k);
                        }
                    }
                }
            }

            System.out.println(m);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}