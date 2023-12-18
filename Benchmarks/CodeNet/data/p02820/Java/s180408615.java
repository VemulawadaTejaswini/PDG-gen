import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        char[] t = new char[n];
        char[] output = new char[n];
        t = sc.next().toCharArray();
        output = t.clone();

        int ans = 0;

        for (int i=0; i<k; i++){
            if (t[i]=='r'){
                ans += p;
                output[i] = 'p';
            }else if (t[i]=='s'){
                ans += r;
                output[i] = 'r';
            }else {
                ans += s;
                output[i] = 's';
            }
        }
//        System.out.println(ans);

        for (int i=k; i<n; i++){
            if (t[i]=='r'){
                if (output[i-k]=='p'){
                    output[i] = '*';
                }else {
                    output[i] = 'p';
                    ans += p;
                }
            }else if (t[i]=='s'){
                if (output[i-k]=='r'){
                    output[i] = '*';
                }else {
                    output[i] = 'r';
                    ans += r;
                }
            }else {
                if (output[i-k]=='s'){
                    output[i] = '*';
                }else {
                    output[i] = 's';
                    ans += s;
                }
            }
        }
//        System.out.println(t[1]);
//        System.out.println(output[1]);
        System.out.println(ans);

    }
}