import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int seki = lcm(n, m);
        int NL = seki / n;
        int ML = seki / m;
        char[] check = new char[seki];
        char[] check2 = new char[seki];
        int a = 0;
        for(int i = 0;i < seki;i ++){
            check[i] = 'A';
            check2[i] = 'A';
        }
        for (int i = 0; i < seki; i += NL) {
            check[i] = s.charAt(a);
            a++;
        }
        a = 0;
        
        for(int i = 0;i < seki;i += ML){
            check2[i] = t.charAt(a);
            a++;
        }
        boolean flag = true;
        for(int i = 0;i < seki;i ++){
            if(check[i] == 'A')continue;
            if(check2[i] == 'A')continue;
            if(check[i] != check2[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(seki);    
        }else{
            System.out.println(-1);
        }
        

    }

    private static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }

    private static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}