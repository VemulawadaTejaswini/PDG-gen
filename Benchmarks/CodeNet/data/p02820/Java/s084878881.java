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
        String st = "";
        long sum = 0;

        for(int i=0; i<N; i++){
            if(i<=K-1){
                if(T.charAt(i)=='r'){
                    st += "p";
                    sum += P;
                }
                else if(T.charAt(i)=='s'){
                    st += "r";
                    sum += R;
                }
                else{
                    st += "s";
                    sum += S;
                }
            }
            else{
                if(T.charAt(i)=='r' && st.charAt(i-K)!='p'){
                    st += "p";
                    sum += P;
                }
                else if(T.charAt(i)=='s' && st.charAt(i-K)!='r'){
                    st += "r";
                    sum += R;
                }
                else if(T.charAt(i)=='p' && st.charAt(i-K)!='s'){
                    st += 's';
                    sum += S;
                }
                else{
                    st += "a";
                }
            }
        }
        System.out.println(sum);
    }
}