import java.util.*;
import java.io.*;
import java.nio.file.Paths;

/*
*/

public class Main{
    public static OutputStream out=new BufferedOutputStream(System.out);

    //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
    public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes());}
    public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
    public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes());}
    public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
    //
    static int MOD=(int)1e9+7;
    static int[][] pascal_trgl=new int[4005][4005];
    //

    public static void main(String[] args) throws IOException{
        // long sttm=System.currentTimeMillis();
        FastReader sc=new FastReader();
        long a=sc.nextLong();
        TreeMap<Long,Long> map=lcm(a);
        // nl(map);
        Iterator<Long> it=map.keySet().iterator();
        long cnt=0;long rem=0;
        while(it.hasNext()){
          long elm=it.next();
          long tempcnt=map.get(elm);
          long n=((long)Math.sqrt(1+8*tempcnt)-1)/2;
          rem+=tempcnt-(n*(n+1))/2;
          cnt+=n;
          // nl(n+" "+rem);
        }
        cnt+=rem/2;
        nl(cnt);
        out.flush();
    }

    static long nCrModPFermat(long n, long r,
									long p)
	{

		// Base case
		if (r == 0)
			return 1l;

		// Fill factorial array so that we
		// can find all factorial of r, n
		// and n-r
		long[] fac = new long[(int)n+1];
		fac[0] = 1;

		for (int i = 1 ;i <= n; i++)
			fac[i] = fac[(int)i-1] * i % p;

		return (fac[(int)n]* modInverse(fac[(int)r], p)
				% p * modInverse(fac[(int)n-(int)r], p)
									% p) % p;
	}

    public static int nCr(int n,int r){
        return pascal_trgl[n][r]%MOD;
    }

    /**/

    public static void intiTriangle(){
        for (int i = 0; i <= 4004; i++) {
			Arrays.fill(pascal_trgl[i], 0);
		}

		pascal_trgl[0][0] = 1;

		for (int i = 1; i <= 4004; i++) {
			pascal_trgl[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				pascal_trgl[i][j] = (pascal_trgl[i - 1][j - 1] + pascal_trgl[i - 1][j]) % MOD;
			}
		}
    }

    public static String decToBin(long val){
        StringBuilder binstr=new StringBuilder();
        while(val>0){
            Long rem=val%2;val/=2;
            binstr.append(Long.toString(rem));
        }
        binstr.reverse();
        return new String(binstr);
    }

    public static long binToDec(String binstr){
        long ans=0;
        long mul=1;int val=0;
        int n=binstr.length();
        for(int i=0;i<n;i++){
            if(binstr.charAt(n-1-i)=='1') val=1;
            ans+=(mul*val);
            val=0;
            mul*=2;
        }
        return ans;
    }

    public static StringBuilder OR(long val1,long val2){
        StringBuilder s=new StringBuilder();
        while(val1>0 || val2>0){
            long rem1=0,rem2=0;
            if(val1>0) rem1=val1%2;
            if(val2>0) rem2=val2%2;
            val1/=2;val2/=2;
            s.append(Long.toString(Math.max(rem1,rem2)));
        }
        s.reverse();
        return s;
    }

    public static boolean dfsCycle(ArrayList<Integer>[] arrl,int[] vis,int st,int pr){
        vis[st]=1;
        int cupr=st;
        for(int elm:arrl[st]){
            if(vis[elm]==1 && elm!=pr){
                return true;
            }
            else if(vis[elm]==0 && dfsCycle(arrl, vis, elm, cupr)){
                return true;
            }
        }
        vis[st]=2;
        return false;
    }



    public static long powMOD(long n,long k){                 //n-pow(k)
        if(k==1){
            return n%MOD;
        }
        if(k==0){
            return 1;
        }
        long val=pow(n,k/2)%MOD;
        if(k%2==0)return ((val%MOD)*(val%MOD))%MOD;
        else return (((val*val)%MOD)*n)%MOD;
    }

    public static long pow(long n,long k){                 //n-pow(k)
        if(k==1){
            return n;
        }
        if(k==0){
            return 1;
        }
        long val=pow(n,k/2);
        if(k%2==0)return ((val)*(val));
        else return (((val*val))*n);
    }


    public static HashMap<Integer,Integer> lcm(int num){
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        while(num%2==0){

            if(!map.containsKey(2)){
                arrl.add(2);
                map.put(2, 1);
            }
            else{
                map.put(2,map.get(2)+1);
            }
            num/=2;
        }
        for(int i=3;i*i<=num;i+=2){
            while(num%i==0){
                if(!map.containsKey(i)){
                    arrl.add(i);
                    map.put(i, 1);
                }
                else{
                    map.put(i,map.get(i)+1);
                }
                num/=i;
            }
        }
        if(num>2){
            if(!map.containsKey(num)){
                arrl.add(num);
                map.put(num, 1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        return map;
    }


    public static TreeMap<Long,Long> lcm(long num){
        ArrayList<Long> arrl=new ArrayList<Long>();
        TreeMap<Long,Long> map=new TreeMap<Long,Long>();
        while(num%2l==0){

            if(!map.containsKey(2l)){
                arrl.add(2l);
                map.put(2l, 1l);
            }
            else{
                map.put(2l,map.get(2l)+1l);
            }
            num/=2l;
        }
        for(long i=3l;i*i<=num;i+=2l){
            while(num%i==0){
                if(!map.containsKey(i)){
                    arrl.add(i);
                    map.put(i, 1l);
                }
                else{
                    map.put(i,map.get(i)+1l);
                }
                num/=i;
            }
        }
        if(num>2l){
            if(!map.containsKey(num)){
                arrl.add(num);
                map.put(num, 1l);
            }
            else{
                map.put(num,map.get(num)+1l);
            }
        }
        return map;
    }


    static long m=998244353l;
    static long modInverse(long a,long m)
    {
        long m0 = m;
        long y = 0l, x = 1l;

        if (m == 1)
            return 0l;

        while (a > 1)
        {

            long q = a / m;

            long t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }
        if (x < 0)
            x += m0;

        return x;
    }


    public static int num_fact(int num){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int cnt=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i==num){
                    cnt+=1;
                }
                else{
                    cnt+=2;
                }
            }
        }
        return cnt;
    }


    public static void sort_inc(int[][] arr,int col){        //change dimention if req
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(final int[] entry1,final int[] entry2) {
                if (entry1[col] > entry2[col])              //this is for inc
                    return 1;
                else if(entry1[col]==entry2[col])
                    return 0;
                else
                    return -1;
            }
        });
    }


    public static boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    static long gcd(long a, long b)
	{
	if (b == 0)
		return a;
	return gcd(b, a % b);
    }

    public static long lcmOfTwo(int a,int b){
        return a*b/gcd(a,b);
    }

}


class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new
                 InputStreamReader(System.in));
    }

    String next(){
        while (st == null || !st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try{
            str = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
}

// Pair Task in process

// class Pair<D1,D2>{
//     D1 v1;
//     D2 v2;

//     Pair(D1 a,D2 b){
//         v1=Math.min(a,b);
//         v2=Math.max(a,b);
//     }
// }
