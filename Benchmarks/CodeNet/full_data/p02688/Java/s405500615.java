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
       int n=in.nextInt();
       int k=in.nextInt();
       ArrayList<Integer> my =new ArrayList<>();
       for(int i=0;i<k;i++){
           int d =in.nextInt();
           for(int j=0;j<d;j++){
               my.add(in.nextInt());
           }
       }int c=0;
       for(int i=1;i<=n;i++){
           if(!my.contains(i)){
               c++;
           }
       }
       out.println(c);
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

