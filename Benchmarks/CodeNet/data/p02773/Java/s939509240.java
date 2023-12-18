				
import java.util.*;import java.io.*;import java.math.*;

public class Main
{
	static class Pair{
		String val;
		int f;
		public Pair(String val,int f){
			this.val=val;
			this.f=f;
		}
	}

	static class sortByF implements Comparator<Pair>{
		public int compare(Pair A,Pair B){
			if(A.f!=B.f)
				return B.f-A.f;
			return (A.val).compareTo(B.val);
		}
	}
    public static void process()throws IOException
    {
    	int n=ni();
    	HashMap<String, Integer> map = new HashMap<>();

    	while(n-- > 0){
    		String s=nln();
    		if(!map.containsKey(s))
    			map.put(s,0);
    		map.put(s,map.get(s)+1);
    	}
    	PriorityQueue<Pair> li = new PriorityQueue<>(new sortByF());
    	for(Map.Entry<String,Integer> e : map.entrySet()){
    		li.add(new Pair(e.getKey(),e.getValue()));
    	}

    	//Collections.sort(li,new sortByF());
    	Pair temp=li.poll();
    	pn(temp.val);

    	while(!li.isEmpty()){
    		Pair pp=li.poll();
    		if(pp.f!=temp.f)
    			break;
    		pn(pp.val);
    	}
    }


   	static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new AnotherReader();
        boolean oj = true;

    	//oj = System.getProperty("ONLINE_JUDGE") != null;
    	if(!oj) sc=new AnotherReader(100);

        long s = System.currentTimeMillis();
        int t=1;
        while(t-->0)
            process();
        out.flush();
        if(!oj)
            System.out.println(System.currentTimeMillis()-s+"ms");
        System.out.close();  
    }

    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);System.out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static boolean multipleTC=false;



/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class AnotherReader{BufferedReader br; StringTokenizer st;
    AnotherReader()throws FileNotFoundException{
    br=new BufferedReader(new InputStreamReader(System.in));}
    AnotherReader(int a)throws FileNotFoundException{
    br = new BufferedReader(new FileReader("input.txt"));}
    String next()throws IOException{
    while (st == null || !st.hasMoreElements()) {try{
    st = new StringTokenizer(br.readLine());}
    catch (IOException  e){ e.printStackTrace(); }}
    return st.nextToken(); } int nextInt() throws IOException{
    return Integer.parseInt(next());}
    long nextLong() throws IOException
    {return Long.parseLong(next());}
    double nextDouble()throws IOException { return Double.parseDouble(next()); }
    String nextLine() throws IOException{ String str = ""; try{
    str = br.readLine();} catch (IOException e){
    e.printStackTrace();} return str;}}
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
	
	
	