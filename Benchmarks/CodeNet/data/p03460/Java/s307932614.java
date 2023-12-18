import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] x = new int[n][3];

        for(int i=0; i<n; i++){
            x[i][0] = sc.nextInt() % (2*k);
            x[i][1] = sc.nextInt() % (2*k);
            if(sc.next() == "B"){
                x[i][2] = 0;
            }else{
                x[i][2] = 1;
            }
        }

        for(int i=0; i<n; i++){
            if(x[i][2] == 0 && x[i][0] >= k){
                x[i][2] = 1;
                x[i][0] -= k;
            }else if(x[i][2] == 0 && x[i][0] < k){
                x[i][2] = 1;
                x[i][0] += k;
            }
            if(x[i][1] >= k && x[i][0] < k){
                x[i][1] -= k;
                x[i][0] += k;
            }else if(x[i][1] >= k && x[i][0] >= k){
                x[i][1] -= k;
                x[i][0] -= k;
            }
        }

        MyComp comp = new MyComp();
        comp.index = 0;

        Arrays.sort(x, comp);
        
        int max = 0;
        int score = 0;
        int npos1 = 0;
        int npos2 = 0;

        max = score;
        
        for(int i=0; i<k; i++){
            score = 0;
            int j1 = 0;
            for(j1=0; j1<n; j1++){
                if(x[j1][0] < k){
                    if(x[j1][1] >= i){
                        score++;
                    }
                }else{
                    break;
                }
            }
            npos2 = j1;
            for(int j=0; j<n; j++){
                if(x[j][0] >= k){
                    if(x[j][1] < i){
                        score++;
                    }
                }
            }
            npos1 = 0;
            if(score > max) max = score;
            for(int j=1; j<2*k; j++){
                int ml1 = npos1;
                for(int l=npos1; l<npos1+n; l++){
                    ml1 = l;
                    if(ml1>=n) ml1 -= n;
                    if(x[ml1][0] == j-1){
                        if(x[ml1][1] < i){
                            score++;
                        }else{
                            score--;
                        }
                    }else{
                        break;
                    }
                }
                npos1 = ml1;                
                int mj = j+k;
                if(mj >= 2*k) mj -= 2*k;
                int ml2 = npos2;
                for(int l=npos2; l<npos2+n; l++){
                    ml2 = l;
                    if(ml2>=n) ml2 %= n;
                    if(x[ml2][0] == mj-1){
                        if(x[ml2][1] < i){
                            score--;
                        }else{
                            score++;
                        }
                    }else{
                        break;
                    }
                }
                npos2 = ml2;                
                if(score > max) max = score;
            }
        }

        System.out.println(max);
    }
}

class MyComp implements Comparator {
    int index = 0;
    void set_index (int i){
        index = i;
    }

    public int compare (Object a, Object b){
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return(int_a[index] - int_b[index]);
    }
}