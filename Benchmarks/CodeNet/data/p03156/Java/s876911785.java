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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyScanner sc = new MyScanner();
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int c = 0, d = 0, e = 0;
        for(int i = 0; i < n; ++i){
            int s = sc.nextInt();
            if(s <= a){
                ++c;
            }else if(s <= b){
                ++d;
            }else{
                ++e;
            }
        }
        int min = c;
        if(min > d){
            min = d;
        }
        if(min > e){
            min = e;
        }
        System.out.println(min);
    }
}
