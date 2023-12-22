import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String[] ia; 

                final BigInteger N = new BigInteger("1001");
                ArrayList<Integer> al; 
                while((is = in.readLine()) != null){
                        ia = is.split(" ");
                        int V = Integer.parseInt(ia[0]);
                        int d = Integer.parseInt(ia[1]);
                        if(V == 0){ 
                                System.out.println(0);
                                continue;
                        }   
                        BigInteger a = BigInteger.ONE, b = BigInteger.ONE, c;
                        al = new ArrayList<Integer>();
                        for(int i = 0;i < V; ++i){
                                c = a.add(b);
                                a = b;
                                b = c;
                                al.add(c.mod(N).intValue());
                        }   
                        Collections.sort(al);
                        int x = 1;
                        int s = al.get(0), t;
                        for(int i = 1;i < al.size(); ++i){
                                t = al.get(i);
                                if((t-s)>=d){
                                        ++x;
                                }   
                                s = t;
                        }   
                        System.out.println(x);
                }   
        }   
}