import java.util.*; 
import java.io.*;

  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        FastReader sc=new FastReader(); 
        int t = sc.nextInt(); 
        
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int k=sc.nextInt();
		    int count=0;
		    while(b<=a){
		        b*=2;
		        count++;
		    }
		    while(c<=b){
		        c*=2;
		        count++;
		    }
		    if(count<=k)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		
         
        
    } 
     public static String sort(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
          
        Arrays.sort(tempArray); 
          
        return new String(tempArray); 
    } 
    static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
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









