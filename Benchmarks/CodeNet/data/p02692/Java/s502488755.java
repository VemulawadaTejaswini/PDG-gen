import java.io.*;
import java.lang.reflect.Array;
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
       int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
        ArrayList<Character> my =new ArrayList<>();
        boolean f =true;
        for(int i=0;i<n;i++){
            String s=in.next();
            if(s.equals("AB")){
                if(a==0 && b==0){
                    out.println("No");
                    f=false;
                    break;
                }
                if(a>b){
                    b++;
                    a--;
                    my.add('B');
                }else{
                    b--;
                    a++;
                    my.add('A');
                }
            }
            if(s.equals("AC")){
                if(a==0 && c==0){
                    out.println("No");
                    f=false;
                    break;
                }
                if(a>c){
                    c++;
                    a--;
                    my.add('C');
                }else{
                    c--;
                    a++;
                    my.add('A');
                }
            }
            if(s.equals("BC")){
                if(c==0 && b==0){
                    out.println("No");
                    f=false;
                    break;
                }
                if(c>b){
                    b++;
                    c--;
                    my.add('B');
                }else{
                    c++;
                    b--;
                    my.add('C');
                }
            }
        }
        if(f){
            out.println("Yes");
            for(int i=0;i<n;i++){
                out.println(my.get(i));
            }
        }
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

