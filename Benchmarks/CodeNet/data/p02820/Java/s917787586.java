import java.util.*;

class Main{
    //149d
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    static long[] num = new long[20];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        char[] t= sc.next().toCharArray();
        sc.close();
        long ans = 0;
        for(int i = 0;i < n;i++){
            switch(t[i]){
                case 'r':
                    ans += p;
                    break;
                case 's':
                    ans += r;
                    break;
                case 'p':
                    ans += s;
                    break;
                default:
                    break;
            }
            int tmp = i + k;
            if(tmp < n-1&&t[i]==t[tmp]){
                t[tmp] = 'k';
            }
        }
        System.out.println(ans);
    }
    
}