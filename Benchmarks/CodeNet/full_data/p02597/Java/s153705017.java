import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        boolean hasWhite = false;
        int ans = 0;
        int redCounter= N-1;

        for(int i=0;i<N;i++){
            if(c[i] == 'W'){
                boolean isFind = false;
                while(!isFind){
                    if(redCounter <= i){
                        break;

                    }
                    if(c[redCounter] == 'R'){
                        if(i < redCounter){
                            ans++;
                        }
                        isFind = true;
                    }
                    redCounter--;

                }

            }
        }

        System.out.println(ans);


    }

}


