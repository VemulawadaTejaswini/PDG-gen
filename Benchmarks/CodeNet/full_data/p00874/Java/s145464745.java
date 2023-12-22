import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int w = sc.nextInt();
            int d = sc.nextInt();
            if(w==0 && d==0) break;

            int[] h1 = new int[w];
            int[] h2 = new int[d];
            for(int i=0; i<w; i++) h1[i] = sc.nextInt();
            for(int i=0; i<d; i++) h2[i] = sc.nextInt();

            int cnt = 0;
            for(int i=0; i<w; i++){
                boolean boo = false;
                for(int j=0; j<d; j++){
                    if(h2[j]==-1) continue;
                    if(h1[i]==h2[j]){
                        cnt += h1[i];
                        h1[i] = h2[j] = -1;
                        boo = true;
                        break;
                    } 
                }
                if(!boo){
                    for(int j=0; j<d; j++){
                        if(h2[j]==-1) continue;
                        if(h1[i]<h2[j]){
                            cnt += h1[i]; 
                            h1[i] = -1;
                            break;
                        }
                    }
                }
            }
            for(int i=0; i<d; i++){
                if(h2[i]!=-1) cnt += h2[i];
            }
            for(int i=0; i<w; i++){
                if(h1[i]!=-1) cnt += h1[i];
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}