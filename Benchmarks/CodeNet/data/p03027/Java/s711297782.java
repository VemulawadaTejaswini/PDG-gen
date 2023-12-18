        import java.util.*;
        public class Main {// Main
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
               int q = sc.nextInt();
              long mod = 1000003;
              for(int Q=0;Q<q;Q++){
                long ans = 1;
              long a = sc.nextLong();
                long d = sc.nextLong();
                long n = sc.nextLong();
                long fin = a + (n-1)*d ;
                
                if(fin<mod){
                  for(int i=0;i<n;i++){ ans = (ans*(a+i*d))%mod ;}
                }
                else if(fin==mod){
                ans = 0;
                }
                else{
                  long mult = a-d;
                  for(int i=0;i<n;i++){ 
                    mult+= d;
                    if(mult==mod) {ans=0; break;}
                    if(mult<mod) ans =(ans*mult)%mod ;
                    else { mult -= mod; ans = (ans*mult)%mod ; }
                  }
                }
                
                System.out.println(ans%mod);
              }
            }
        }							