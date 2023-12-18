import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String a = "RGB";
        int ans = 0;
        int r = 0;
        int g = 0;
        int b = 0;

        for(int i=0; i<N; i++){
            if(S.charAt(i)==a.charAt(0)){
                r += 1;
            }
            else if(S.charAt(i)==a.charAt(1)){
                g += 1;
            }
            else{
                b += 1;
            }
        }
        ans = r * g * b;
        int x = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                if(2*j-i>=N){
                    break;
                }
                if(S.charAt(i)!=S.charAt(j) && S.charAt(j)!=S.charAt(2 * j - i) && S.charAt(i)!=S.charAt(2 * j - i)){
                    x += 1;
                }
            }
        }
        ans -= x;
        System.out.println(ans);
    }
}