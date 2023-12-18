import java.util.*;
import javafx.util.Pair;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader();
		int n =in.nextInt();
		// boolean x[] = new boolean[n];
		Pair<Integer, Integer> arr[] = new Pair[n];
		for(int i=0; i<n; i++){
			arr[i]=new Pair<>(in.nextInt(),i);
		}
		Arrays.parallelSort(arr,(a,b)->b.getKey()-a.getKey());
		int lo=0, hi=n-1, sc=0;
		for(Pair<Integer, Integer> i: arr)
		{
			if(Math.abs(i.getValue()-hi)>=Math.abs(i.getValue()-lo)){
				sc+= i.getKey()*Math.abs(i.getValue()-hi--);
			}else{
				sc+= i.getKey()*Math.abs(i.getValue()-lo++);
			}
			// out(i+" "+lo+" "+hi+" "+sc+"\n");
		}
		out(sc+"");
	}
	static void out(String s){
		System.out.print(s);
	}
}



class BufferedReader 
{ 
    java.io.BufferedReader br; 
    StringTokenizer st; 

    public BufferedReader() 
    { 
        br = new java.io.BufferedReader(new
                    InputStreamReader(System.in)); 
    } 

    public String next() 
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

    public int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    public long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    public double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    public String nextLine() 
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