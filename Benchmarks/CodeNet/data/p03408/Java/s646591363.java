import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n+1];
        s[0] = "a";
        for(int i=1;i<=n;i++){
            s[i] = sc.next();
        }
        int m = sc.nextInt();
        String t[] = new String[m+1];
        t[0] = "a";
        for(int i=1;i<=m;i++){
            t[i] = sc.next();
        }
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        int c[] = new int[n+1];
        for(int i=0;i<=n;i++){
            a[i] = 0;
            b[i] = 0;
            c[i] = 0;
        }
        int max = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s[j].equals(s[i])){
                    a[i] += 1;
                }
            }
            for(int k=1;k<=m;k++){
                if(t[k].equals(s[i])){
                    b[i] += 1;
                }
            }
            c[i] = a[i] - b[i];
            if(c[i]>max){
                max = c[i];
            }
        }
        System.out.println(max);
    }