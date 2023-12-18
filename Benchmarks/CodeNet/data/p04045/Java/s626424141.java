import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
public class Main {
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver=new Task();
        solver.solve(1,in,out);
        out.close();
    }
    static class Task{
        public void solve(int testnumber,InputReader in,PrintWriter out){
            int n = in.nextInt();
            int k = in.nextInt();
            int [] a = new int[k];
            int [] b = new int[10];
            for(int i=0;i<k;i++){
                a[i] = in.nextInt();
            }
            int u = n;
            int h = 0;
            while(u != 0){
               b[h++] = u % 10;
               u /= 10;
            }
            int pos = 0;
            for(int i = h - 1 ; i >= 0 ; i--){
                int num = b[i];
                boolean flag = false;
                boolean f = false;
                for(int j = 0 ;j < k ; j++){
                    if(a[j] == num) {
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    int tempnum = b[i] + 1;
                    while(tempnum != 10){
                        boolean flag2 = false;
                        for(int j = 0 ; j < k ; j++){
                            if(a[j] == tempnum){
                                flag2 = true;
                                break;
                            }
                        }
                        if(flag2){
                            tempnum++;
                        } else {
                            f = true;
                            b[i] = tempnum;
                            break;
                        }
                    }
                }
                if(f){
                    pos = i;
                    break;
                }
            }
            for(int i = pos - 1 ; i >= 0 ; i--){
                int num = b[i];
                boolean flag = false;
                for(int j = 0 ;j < k ; j++){
                    if(a[j] == num) {
                        flag = true;
                        break;
                    }
                }
                int tempnum1 = 0;
                int tempnum2 = b[i] + 1;
                if(flag){
                    boolean gh = false;
                    while(tempnum1 < b[i]){
                        boolean flag2 = false;
                        for(int j = 0 ; j < k ; j++){
                            if(a[j] == tempnum1){
                                flag2 = true;
                                break;
                            }
                        }
                        if(flag2){
                            tempnum1++;
                        } else {
                            gh = true;
                            b[i] = tempnum1;
                            break;
                        }
                    }
                    if(!gh){
                        while(tempnum2 <= 9){
                            boolean flag2 = false;
                            for(int j = 0 ; j < k ; j++){
                                if(a[j] == tempnum1){
                                    flag2 = true;
                                    break;
                                }
                            }
                            if(flag2){
                                tempnum2++;
                            } else {
                                b[i] = tempnum2;
                                break;
                            }
                        }
                    }
                }
            }
            for(int i = h -1 ; i >= 0 ; i--){
                out.print(b[i]);
            }
            out.println("");
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
