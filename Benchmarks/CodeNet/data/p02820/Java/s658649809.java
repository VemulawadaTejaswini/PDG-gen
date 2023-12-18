import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        long sum = 0;

        for(int i=0; i<N; i++){
            if(i<=K-1){
                if(T.charAt(i)=='r'){
                    sum += P;
                }
                else if(T.charAt(i)=='s'){
                    sum += R;
                }
                else{
                    sum += S;
                }
            }
            else{
                if(T.charAt(i)!=T.charAt(i-K)){
                    if(T.charAt(i)=='r'){
                        sum += P;
                    }
                    else if(T.charAt(i)=='s'){
                        sum += R;
                    }
                    else{
                        sum += S;
                    }
                }
                else{
                    T=T.substring(0, i) + "a" + T.substring(i + 1);
                }
            }
        }
        System.out.println(sum);
    }
}