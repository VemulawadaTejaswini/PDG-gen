import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long a,b,gcd;
            String line = br.readLine();
            StringTokenizer st;
            while(line!=null){
                st=new StringTokenizer(line);
                a=Long.parseLong(st.nextToken());
                b=Long.parseLong(st.nextToken());
                Test t = new Test();
                gcd=t.gcd(a,b);
                System.out.println(gcd + " " + t.lcm(a,b,gcd));
                line = br.readLine();
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Test{
    long r;
    long gcd(long a, long b){
        while(true){
            if(a>b){
                a=a-b;
            }else{
                break;
            }
        }
        if(b%a==0){
            r=a;
        }else{
            gcd(b,a);
        }
        return r;
    }

    long lcm(long a, long b,long gcd){
        return a*b/gcd;
    }
}