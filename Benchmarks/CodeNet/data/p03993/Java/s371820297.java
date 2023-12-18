import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class MyScanner{
    InputStream stream;
    public MyScanner(){
        stream = System.in;
    }
    
    public int nextInt(){
        int ret = 0;
        try{
            while(true){
                char readed = (char)stream.read();
                if(readed < '0' || readed > '9'){
                    break;
                }
                ret = ret * 10 + (readed - '0');
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return ret;
        }
    }
}

class Main {
    public static void main(String args[]) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt() - 1;
        }
        
        int ret = 0;
        for(int i = 0; i < n; ++i){
            if(a[a[i]] == i){
                ++ret;
            }
        }
        System.out.println(ret / 2);
    }
}
