import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[] a = new int[m];
        for(int i = 0;i < m; i++) {
            a[i] = stdIn.nextInt();
        }

        int num[] = new int[m + 1];

        int st[] = new int[m + 1];

        if(m ==0) {
            st[0] = n;
        } else{
            st[0] = a[0] - 1;
            st[m] = n - a[m - 1] - 1;
            for(int i = 1; i < m;i++) {
                st[i] = a[i] - a[i - 1] - 1;
            }

            for(int i = 0;i < m + 1;i++ ) {
                if(st[i] == 0) {
                    num[i] = 1;
                }
            }
        }

        for(int i = 0; i < m + 1; i++) {
            if(st[i] % 2 == 0) {
                int x;
                int p = st[i] / 2 + 1;
                int b;
                for(int j = 0; j < st[i] / 2; j++) {
                    x = 2 * j + 1;
                    num[i] = 0;
                    int p1 = 1;
                    int p2 = 1;
                    int p3 = 1;
                    int ww = p - x; 
                    for(int k = p;k > 0; k--) {
                        p1 *= k;
                    }
                    for(int k =x;k > 0;k--) {
                        p2 *= k;
                    }
                    for(int k =ww;k > 0;k--) {
                        p3 *= k;
                    }
                    int re = p1 / p2 / p3;
                    num[i] += re;

                    //System.out.println(p);

                    p += 1;
                }
                
            } else {
                int x;
                int p = st[i] / 2;
                int b;
                for(int j = 0; j < st[i] / 2; j++) {
                    x = 2 * j;
                    num[i] = 0;
                    int p1 = 1;
                    int p2 = 1;
                    int p3 = 1;
                    int ww = p - x; 
                    for(int k = p;k > 0; k--) {
                        p1 *= k;
                    }
                    for(int k =x;k > 0;k--) {
                        p2 *= k;
                    }
                    for(int k =ww;k > 0;k--) {
                        p3 *= k;
                    }
                    int re = p1 / p2 / p3;
                    num[i] += re;
                    p += 1;
                } 
                //System.out.println("!");
                num[i] += 1;
                
            }
            System.out.println(num[i]);
        }

        int answer = 1;
        for(int i = 0;i < m + 1;i++) {
            answer *= num[i];
        }
        
        answer %= 1000000007;

        System.out.println(answer);
    }
}