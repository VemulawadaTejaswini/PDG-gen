import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        long N = r.l();
        int limit = (int)Math.pow(N+1, 0.5);
        long ans = 0;
        for(int i = 1; i < limit; i++){
            if(N%i == 0){
                ans += N/i-1;
            }
        }
        print(ans);
    }
    
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        long Long(String s){
            return Long.parseLong(s);
        }
        long l() throws IOException{
            return Long(s());
        }
    }
}
