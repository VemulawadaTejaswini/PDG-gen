
import java.io.*;
import java.util.*;
import java.math.*;

public class Main { 
    
    public static void main(String[] args) throws java.lang.Exception { 
        //Reader pm =new Reader(); 
        Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        while(t-- > 0){
            int n = pm.nextInt();
            StringBuffer sb = new StringBuffer(pm.next());
            Set<Integer> r = new HashSet<>();
            Set<Integer> g = new HashSet<>();
            Set<Integer> b = new HashSet<>();
            for(int i=0;i<n;i++){
                if(sb.charAt(i) == 'R')
                    r.add(i);
                else if(sb.charAt(i) == 'G')
                    g.add(i);
                else
                    b.add(i);
            }
            long cnt = 0;
            for(Integer i:r){
                for(Integer j:b){
                    int med = (i+j)/2;
                    if((i+j) % 2 == 0 && g.contains(med)){
                        cnt++;
                    }
                }
            }
            for(Integer i:r){
                for(Integer j:g){
                    int med = (i+j)/2;
                    if((i+j) % 2 == 0 && b.contains(med)){
                        cnt++;
                    }
                }
            }
            for(Integer i:g){
                for(Integer j:b){
                    int med = (i+j)/2;
                    if((i+j) % 2 == 0 && r.contains(med)){
                        cnt++;
                    }
                }
            }
            ArrayList<Integer> rl= new ArrayList<>(r);
            ArrayList<Integer> gl= new ArrayList<>(g);
            ArrayList<Integer> bl= new ArrayList<>(b);
            Collections.sort(rl);
            Collections.sort(gl);
            Collections.sort(bl);

            // System.out.println(rl);
            // System.out.println(gl);
            // System.out.println(bl);
            long ans = 0;
            ans = rl.size()*gl.size()*bl.size();
            // for(int i=0;i<rl.size();i++) {
            //     for(int j=0;j<gl.size();j++) {
            //         if(gl.get(j) > rl.get(i)) {
            //             int ind = Collections.binarySearch(bl, gl.get(j));
            //             int toAdd = (bl.size()-(Math.abs(ind)-1));
            //             System.out.println(gl.get(j)+" "+ind+" "+toAdd);
            //             ans += toAdd;
            //         }
            //     }
            // }
            System.out.println(ans-cnt);
            
        }
        //end of tests
        
    }
    //end of main class
    
    static class Reader { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
}    