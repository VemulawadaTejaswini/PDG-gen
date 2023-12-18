import java.util.*;
import java.io.*;
import static java.lang.Double.max;
import static java.lang.Integer.min;
import static java.lang.Math.pow;
import static java.util.Collections.sort;
public class Main {
    static long mod=998244353;
    static HashMap<Long,Integer> M=new HashMap();
    static FastReader in=new FastReader();
    static List<Integer >G[];
    public static void main(String [] args) {
        
        StringBuilder Sd=new StringBuilder();
        int n=in.nextInt(),m=in.nextInt();
        int a[]=new int [n+1];
        for(int i=1;i<=n;i++)a[i]=-1;
        for(int i=0;i<m;i++){
        int s=in.nextInt(),c=in.nextInt();
        if(a[s]==-1||a[s]==c){a[s]=c;}
        else{System.out.println("-1");return;}
        if(s==1&&c==0&&n>1){System.out.println("-1");return;}
        }
        if(n>1&&a[1]==-1)a[1]=1;
        for(int i=1;i<=n;i++){
        Sd.append(a[i]==-1?0:a[i]);
        }
        System.out.println(Sd);
    }
    
    static long gcd(long g,long x){
        if(x<1)return g;
        else return gcd(x,g%x);
    
    }
}
class node implements Comparable<node>{
int f, e;
node(int tt,int ll){
f=tt;e=ll;
}
    @Override
    public int compareTo(node o) {
    return f-o.f;    
    }
}
class FastReader
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
 
class Sorting{
 
 public static int[] bucketSort(int[] array, int bucketCount) {
 
 if (bucketCount <= 0) throw new IllegalArgumentException("Invalid bucket count");
 
 if (array.length <= 1) return array; //trivially sorted
 
 
 
 int high = array[0];
 
 int low = array[0];
 
 for (int i = 1; i < array.length; i++) { //find the range of input elements
 
 if (array[i] > high) high = array[i];
 
 if (array[i] < low) low = array[i];
 
 }
 
 double interval = ((double)(high - low + 1))/bucketCount; //range of one bucket
 
 
 ArrayList<Integer> buckets[] = new ArrayList[bucketCount];
 
 for (int i = 0; i < bucketCount; i++) { //initialize buckets
 
 buckets[i] = new ArrayList();
 
 }
 
 
 
 for (int i = 0; i < array.length; i++) { //partition the input array
 
 buckets[(int)((array[i] - low)/interval)].add(array[i]);
 
 }
 
 
 int pointer = 0;
 
 for (int i = 0; i < buckets.length; i++) {
 
 Collections.sort(buckets[i]); //mergeSort
 
 for (int j = 0; j < buckets[i].size(); j++) { //merge the buckets
 
 array[pointer] = buckets[i].get(j);
 
 pointer++;
 
 }
 
}
 
return array;
 
}
 
}