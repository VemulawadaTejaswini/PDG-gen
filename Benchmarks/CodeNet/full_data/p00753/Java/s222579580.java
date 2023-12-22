import java.util.*;
class Main{
        final static int MAX = 123456*2;
        static boolean[] prime = new boolean[MAX+1];
        public static void make_prime(){
                for(int i=0;i<=MAX;i++){
                        prime[i] = true;
                }
                prime[1] = false;
                for(int i=2;i*i<=MAX;i++){
                        if(prime[i]){
                                for(int j=i+i;j<=MAX;j+=i){
                                        prime[j] = false;
                                }
                        }
                }
        }

        static Scanner sc = new Scanner(System.in);
        public static void doIt(){
                make_prime();
                while(true){
                        int n = sc.nextInt();
                        if(n==0)break;
                        int ans=0;
                        for(int i=n+1;i<=2*n;i++){
                                if(prime[i])ans++;
                        }
                        System.out.println(ans);
                }
        }
        public static void main(String[] args){
                Main obj = new Main();
                obj.doIt();
        }

}