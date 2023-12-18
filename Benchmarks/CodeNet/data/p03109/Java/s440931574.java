
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
        boolean minus = false;
        try{
            stream.mark(1);
            if((char)stream.read() == '-'){
                minus = true;
            }else{
                stream.reset();
            }
            while(true){
                char readed = (char)stream.read();
                if(readed < '0' || readed > '9'){
                    break;
                }
                ret = ret * 10 + (readed - '0');
            }
            if(minus){
                ret *= -1;
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
        int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
        if(m < 5){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }
}
