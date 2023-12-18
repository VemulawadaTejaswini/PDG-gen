import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader in = new FastReader();
        test a=new test();
        a.solve(in,out);
        out.close();
    }
}
class test{
    public void solve(FastReader in, PrintWriter out){
       long x=in.nextLong();
       long b =100;
       long c=0;
       while(true){
           long i=b/100;
           b+=i;
           c++;
           if(b>=x){
               out.println(c);
               break;
           }
       }
    }
    public boolean src(int a[],int b[],int k,int l){
        for(int i=0;i<a.length;i++){
            if(a[i]==k && b[i]==l){
                return true;
            }
        }
        return false;
    }
    public int search(ArrayList<Integer> my){
        int max=my.get(0);
        int k=0;
        for(int i=1;i<my.size();i++){
            if(my.get(i)>max){
                max=my.get(i);
                k=i;
            }
        }
        return k;
    }
}

class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    Long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str="";
        try{
            str=br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
}

