import java.util.*;
import java.io.*;
public class Main{

 static class Reader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public Reader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 


  
    public static void main(final String [] args)throws IOException{
       Reader sc=new Reader();
       int n=sc.nextInt();
       int [] a=new int[n];
       long sum=0;
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
           sum+=a[i];
           map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

       int q=sc.nextInt();

       for(int i=0;i<q;i++){
           
           long A=sc.nextInt();
           long B=sc.nextInt();
           long cnt=map.getOrDefault((int)A,0);

           sum=sum-A*cnt;
           sum=sum+B*cnt;
           System.out.println(sum);

           map.put((int)B,map.getOrDefault((int)B,0)+(int)cnt);
           map.put((int)A,0);


       }


    }
}


