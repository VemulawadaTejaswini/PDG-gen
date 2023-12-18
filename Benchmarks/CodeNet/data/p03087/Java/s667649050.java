import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String S = scanner.next();
        int a[] = new int[Q];
        int b[] = new int[Q];
        for(int i=0;i<Q;i++){
            a[i] =scanner.nextInt();
            b[i] =scanner.nextInt();
        }
        int t[] = new int[N+1];
        String find ="AC";
        for(int i=0;i<N;i++) {
            if(i==0){t[i]=0;}
            if(i>=1 && S.substring(i-1,i+1).equals(find)){
                t[i] = 1;}
            else{t[i] = 0;
            }
        }
        int s[] = new int[N+1];
        for(int i =0;i<N;i++){
            if(i==0){s[i]=t[i];}else{
                s[i] = t[i] + s[i-1];
                }
        }
        for(int i=0;i<Q;i++){
            System.out.println(s[b[i]-1]-s[a[i]-1]);
        }
    }
}