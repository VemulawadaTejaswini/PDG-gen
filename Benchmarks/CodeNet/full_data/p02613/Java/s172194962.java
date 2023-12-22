import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args){
        try {
            PrintWriter out=new PrintWriter(System.out,true);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            Map<String,Integer> map=new HashMap<>();
            map.put("AC",0);
            map.put("RE",0);
            map.put("TLE",0);
            map.put("WA",0);
            for(int i=0;i<t;i++){
                String str=br.readLine();
                map.put(str,map.get(str)+1);
            }
            out.println("AC x "+map.get("AC"));
            out.println("WA x "+map.get("WA"));
            out.println("TLE x "+map.get("TLE"));
            out.println("RE x "+map.get("RE"));
            out.close();
        } catch (Exception e) {
            System.out.println("kkkk "+ e.getMessage());
        }
    }
    static boolean isPal(String s){
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        String ss=String.valueOf(str);
        if (ss.equals(s)) {
            return true;
        }
        return false;
    }
    static int mod(int a,int b){
        if (a>b){
            return a-b;
        }
        return b-a;
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
    static int lcm(int a,int b){
        long c=a*b;
        return (int)(c/hcf(a,b));
    }
    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>b)
            return hcf(a%b,b);

        return hcf(a,b%a);
    }
    static void dfs(ArrayList<HashSet<Integer>> list,boolean[] vis,int i){
        vis[i]=true;
        Iterator<Integer> it=list.get(i).iterator();
        while(it.hasNext()){
            int u=it.next();
            if(!vis[u]){
                dfs(list,vis,u);
            }
        }
    }
    static int modInverse(int x,int m){
        return power(x,m-2,m);
    }
    static int power(int x, int y, int m)
    {
        if (y == 0)
            return 1;

        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (int)((y%2==0)? p : (x*p)%m);
    }
    static class pair{
        int a,b;
        public pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}