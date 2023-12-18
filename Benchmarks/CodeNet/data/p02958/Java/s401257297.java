import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int prev = sc.nextInt();
        int p[] = new int[N];
        boolean flag = true;
        p[0] = prev;
        for(int i = 1; i < N; i++){
            p[i] = sc.nextInt();
            if(p[i] < prev){
                flag = false;
            }
            prev = p[i];
        }
        if(flag){
            System.out.println("YES");
        }else{
            boolean f = false;
            for(int i = 0; i < N - 1; i++){
                for(int j = i + 1; j < N; j++){
                    f = true;
                    for(int k = 0; k < N - 1; k++){
                        int a = p[k];
                        if(k == i){
                            a = p[j];
                        }
                        if(k == j){
                            a = p[i];
                        }
                        int b = p[k + 1];
                        if(k + 1 == i){
                            b = p[j];
                        }
                        if(k + 1 == j){
                            b = p[i];
                        }
                        if(a > b){
                            f = false;
                            break;
                        }
                    }
                    if(f){
                        break;
                    }
                }
                if(f){
                    break;
                }
            }
            if(f){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
