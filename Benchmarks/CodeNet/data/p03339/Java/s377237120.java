import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int a[] = new int[N];
        String west ="W";
        for(int i=0;i<N;i++){
            if(S.charAt(i) == 'W'){
                a[i] = 1;
            }else{a[i]=0;}
        }
        int s[] = new int[N];
        for(int i =0;i<N;i++){
            if(i==0){s[i]=0;}
            else{
                s[i] = a[i-1] + s[i-1];
            }
        }
        int b[] = new int[N];
        String east ="E";
        for(int i=0;i<N;i++){
            if(S.charAt(i) == 'E'){
                b[i] = 1;
            }else{a[i]=0;}
        }
        int t[] = new int[N];
        for(int i =N - 1;i>=0;i--){
            if(i==N-1){t[i]=0;}
            else{
                t[i] = b[i+1] + t[i+1];
            }
        }
        int ans =(int)1e9;
        for(int i=0;i<N;i++){
            ans=Math.min(ans,s[i]+t[i]);
        }
        System.out.println(ans);
    }
}