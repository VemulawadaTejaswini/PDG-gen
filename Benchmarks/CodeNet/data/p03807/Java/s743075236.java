  import java.util.*; 
                        import java.math.*;
                        import java.io.*;
                        import java.text.DecimalFormat;
                        import java.math.BigInteger;
                        public class Main{
                            //static int d=20;
                            static long mod=1000000007 ;
                            static HashMap<String,Double> hm=new HashMap<>(); 
                            static ArrayList<ArrayList<Integer>> arr;
                            static long[] dp1,dp2;
                            static int[] a;
                            static int[] vis,num;
                            static long max;
                            static HashSet<String> hs;
                            //static int flag,ans;
                            static long max1,max2,ans1;
                            static long ct=0;
 
                            public static void main(String[] args)  throws IOException {
                                boolean online =false;
                                String fileName = "C-large-practice";
                                PrintWriter out; 
                                if (online) {
                                    s.init(new FileInputStream(new File(fileName + ".in")));
                                     out= new PrintWriter(new FileWriter(fileName + "out.txt"));
                                }
                                 else {
                                    s.init(System.in);   
                                
                                    out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
                                }//r,b,y,g
                                int n=s.ni();
                                long[] a=new long[n];
                                int ans=0;
                                for(int i=0;i<n;i++){
                                    a[i]=s.nl();
                                    if(a[i]%2==1)
                                        ans++;
                                }
                                if(ans%2==1)
                                    out.println("NO");
                                else
                                    out.println("YES");

                                out.close();
                 
                            }
                            public static double nthroot(int n, double A) {
                                return nthroot(n, A, 0.00000000000001);
                            }
                            public static double nthroot(int n, double A, double p) {
                                if(A < 0) {
                                    System.err.println("A < 0");// we handle only real positive numbers
                                    return -1;
                                } else if(A == 0) {
                                    return 0;
                                }
                                double x_prev = A;
                                double x = A / n;  // starting "guessed" value...
                                while(Math.abs(x - x_prev) > p) {
                                    x_prev = x;
                                    x = ((n - 1.0) * x + A / Math.pow(x, n - 1.0)) / n;
                                }
                                return x;
                            }
                            
                            static class query implements Comparable<query> {
                                int id;
                                long n;
                                public query(int a,long b){
                                    {   id=a;
                                        n=b;
                                        
                                    }
                                    
                                    
                                    
                                }
                                public int compareTo(query o){
                                
                                    return (int)Math.signum(n-o.n);
                                }
                                
                            }
                           
                            public static void dfs2(int c,int p,int[] a){
                                //System.out.println(c+" "+p);
                               
                                
                                
     
                            }
                            public static void dfs(int x,int[] vis,Stack<Integer> st){
                                vis[x]=1;
                                ArrayList<Integer> arr2=arr.get(x);
                                Collections.sort(arr2);
                                for(int i=arr2.size()-1;i>=0;i--){
                                    int z=arr2.get(i);
                                    if(vis[z]==0)
                                        dfs(z,vis,st);
                                }
                                st.push(x);
     
                            }
                            public static long gcd(long a, long b){
                                    if (a == 0) return b;
                                    return gcd(b % a, a);
                            }
                                
                            public static boolean check(long x){
                                if(x%4==0 || x%7==0 || x%11==0)
                                    return true;
                                if(x<4 || x<7 || x<11)
                                    return false;
                                if(x%2==0){
                                    return check(x/2);
                                }
                                else
                                    return check(x/2) && check((x+1)/2);
                            }
                            public static int angle(int x1,int x2,int x3,int y1,int y2,int y3){
                                long val=(y2-y1)*1L*(x3-x2)-(y3-y2)*1L*(x2-x1);
                                if(val<0)
                                    return 1;
                                else if(val>0)
                                    return -1;
                                else
                                    return 0;
                            }
                            
                            static class BIT{
                            
                                int N;
                                long tree[];
                                
                                BIT(int N){
                                    this.N = N;
                                    tree = new long[N + 1];
                                }
                                
                                void update(int idx,long val){
                                    while(idx <= N){
                                        tree[idx]+=val;
                                        idx += (idx & -idx);
                                    }
                                }
                                
                                long query(int l,int r){
                                    if(l == 1)
                                        return read(r);
                                    else
                                        return read(r) - read(l-1);
                                }
                                
                                long read(int idx){
                                    long sum = 0;
                                    while(idx > 0){
                                        sum += tree[idx];
                                        idx -= (idx & -idx);
                                    }
                                    return sum;
                                }
                            }
                            public static boolean pal(String a){
                                int i=0;
                                int j=a.length()-1;
                                while(i<j){
                                    if(a.charAt(i)!=a.charAt(j)){
                                        return false;
                                    }
                                    i++;
                                    j--;
                                }
                                return true;
                                    
                            }
                            public static long find(long n,long k){
                                if(n==2){
                                    if(k==1 || k==3)
                                        return 1;
                                    else
                                        return 2;
                                }
                                long t=pow2(2,n,mod)-1;
                                long z=(t+1)/2;
                                if(k==z)
                                    return n;
                                if(k<z)
                                    return find(n-1,k);
                                else
                                    return find(n-1,k-z);
                            }
                            public static long pow2(long a,long b,long mod){
                                    
                                    long ans=1;
                                   // long z=b;
                                    while(b>0){
                                       
                                        if(b%2==1)
                                            ans=(a*ans)%mod;
                                        a=(a*a)%mod;
                                        b/=2;
                                    }
                                  
                                    return  ans;
                            }
                            public static long pow3(long a,long b,long n){
                                    long ans=1L;
                                    while(b>0){
                                        if(b%2==1){
                                            if((ans)>(Long.MAX_VALUE/a))
                                                ans=Long.MAX_VALUE;
                                            else
                                                ans=(a*ans);
                                        }
                                        if(a>((Long.MAX_VALUE/a)))
                                            a=Long.MAX_VALUE;
                                        else
                                            a=(a*a);
                                        b/=2;
                                    }
                                    return  ans;
                            }
                            public static long fib(long n){
                                long[][]    f=new long[][]{{1L,1L},{1L,0}};
                                if(n==0)
                                    return 0;
                                f=arrpow(f,n-1);
                                return f[0][0];
                            }
                            public static long[][] arrpow(long[][] a,long b){
                               
                                    int n=a.length;
                                  //  long z=b;
                                    long[][] ans=new long[n][n];
                                    for(int i=0;i<n;i++)
                                        ans[i][i]=1L;
                                    while(b>0){
                                        
                                        if(b%2==1)
                                            ans=mul(a,ans);
                                        a=mul(a,a);
                                        b/=2;
                                    }
                                    
                                    return  ans;
                            }
                            public static long[][] mul(long[][] a,long[][] b){
                                int n=a.length;
                                int m=b[0].length;
                                long[][] ans=new long[n][m];
                                if(n==2 && m==2 && b.length==2){
                                    ans[0][0]=((a[0][0]*b[0][0])%mod+(a[0][1]*b[1][0]))%mod;
                                    ans[0][1]=((a[0][0]*b[0][1])%mod+(a[0][1]*b[1][1]))%mod;
                                    ans[1][0]=((a[1][0]*b[0][0])%mod+(a[1][1]*b[1][0]))%mod;
                                    ans[1][1]=((a[1][1]*b[1][1])%mod+(a[1][0]*b[0][1]))%mod;
                                    return ans;
 
                                }
                                for(int i=0;i<n;i++){
                                    for(int j=0;j<m;j++){
                                        for(int k=0;k<b.length;k++){
                                            ans[i][j]=(ans[i][j]+(a[i][k]*b[k][j])%mod)%mod;
                                        }
                                    }
                                }
                                return ans; 
                            }
                             static class name implements Comparable<name> {
                                long l,b,h;
                                public name(long   x,long y,long z){
                                    {
                                        l=x;
                                        b=y;
                                    }
                                    
                                    
                                    h=z;
                                }
                                public int compareTo(name o){
                                    return -(int)(l*b-o.l*o.b);
                                }
                                
                            }
                            public static class s {
                                static BufferedReader reader;
                                static StringTokenizer tokenizer;
                            
                                /** call this method to initialize reader for InputStream */
                                static void init(InputStream input) {
                                    reader = new BufferedReader(
                                                new InputStreamReader(input) );
                                    tokenizer = new StringTokenizer("");
                                }   
                            
                                /** get next word */
                                static String ns() throws IOException {
                                    while ( ! tokenizer.hasMoreTokens() ) {
                                        //TODO add check for eof if necessary
                                        tokenizer = new StringTokenizer(
                                            reader.readLine() );
                                    }
                                    return tokenizer.nextToken();
                                }
                            
                                static int ni() throws IOException {
                                    return Integer.parseInt( ns() );
                                }
                            
                                static double nd() throws IOException {
                                    return Double.parseDouble( ns() );
                                }
                                static long nl() throws IOException {
                                    return Long.parseLong( ns() );
                                }
                            }
                        }
                                
  