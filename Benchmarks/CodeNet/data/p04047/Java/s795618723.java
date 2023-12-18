import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by vikas.k on 25/12/16.
 */
public class A {
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = sc.nextInt();

        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<2*n;i++){
            lst.add(sc.nextInt());
        }

        Collections.sort(lst);
        int cnt = 0;
        for(int i=0;i<lst.size();i+=2){
            cnt+= Math.min(lst.get(i),lst.get(i+1));
        }
        out.println(cnt);
        out.close();
    }
    public static PrintWriter out;

    private static class MyScanner{
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private MyScanner(){
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next(){
            if(stringTokenizer == null || !stringTokenizer.hasMoreElements()){
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt(){
            return Integer.parseInt(next());
        }
        private String nextLine(){
            String ret= "";
            try {
                ret= bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }
}
