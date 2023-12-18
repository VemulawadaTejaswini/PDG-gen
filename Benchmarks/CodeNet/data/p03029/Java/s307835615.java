import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main  {
	public static ArrayList<Pair> arrayList = new ArrayList<>();
	public static void main(String[] args){
		FastReader sc = new FastReader();
		int N=sc.nextInt();
		String[] S=new String[N];
		int[] P=new int[N];
		int ans=0;
		for (int i = 0; i < P.length; i++) {
			S[i]=sc.next();
			P[i]=sc.nextInt();
		}
		for (int i = 0; i < P.length; i++) {
			arrayList.add(new Pair(S[i],P[i]));
		}
		ArrayList<Pair> psort=(ArrayList<Pair>) arrayList.clone();
		Collections.sort(arrayList,new pairComp());
		for (int i = 0; i < P.length; i++) {
			System.out.println(psort.indexOf(arrayList.get(i))+1);
		}
}
	static class Pair{
		public String name;
		public int value;
		public Pair(String name,int value) {
			this.name=name;
			this.value=value;
		}
	}
	
	static class pairComp implements Comparator<Pair>{
		@Override
		public int compare(Pair p1,Pair p2) {
			int c=p1.name.compareTo(p2.name);
			if (c==0) {
				c=(p1.value-p2.value)*(-1);
			}
			return c;
		}
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}