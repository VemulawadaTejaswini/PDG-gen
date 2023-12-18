import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        // int [] arr = { 1 , 6 , 120 , 496 , 2016, 8128 ,32640 , 130816};
        byte n = f.nextByte();
        byte [] arr = new byte[n];
        for(byte i =0;i<arr.length ;i++){
            arr[i]=f.nextByte();
        }
        int AScore=0 , BScore=0;
        Arrays.sort(arr);
        for(byte i = (byte) (arr.length-1) ; i>=0 ;i-=2){
            if(i!=0){            
                byte j =(byte) (i-1);
                            BScore+=arr[j];

                         }
            AScore+=arr[i];
            
        }
        
        System.out.println(AScore-BScore);
     
    }   
 }


class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
  
        byte nextByte() 
        { 
            return Byte.parseByte(next()); 
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
