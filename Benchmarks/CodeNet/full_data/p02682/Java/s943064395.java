import java.util.*;
import java.io.*;

/*
*/

class Main{
    public static OutputStream out=new BufferedOutputStream(System.out);

    //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
    public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes());}
    public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
    public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes());}
    public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
    //
    static int MOD=1000000007;
    //
    public static void main(String[] args) throws IOException{
        // long sttm=System.currentTimeMillis();
        FastReader sc=new FastReader();
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
        int sum=0;
        while(k>0){
            if(a!=0){
                sum+=Math.min(k,a);
                k-=Math.min(k,a);a=0;
                // nl(k+" "+sum);
            }
            else if(b!=0){
                k-=Math.min(k,b);b=0;
                // nl(k);
            }
            else{
                sum-=k;
                k=0;c=0;
            }
        }
        nl(sum);
        out.flush();
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