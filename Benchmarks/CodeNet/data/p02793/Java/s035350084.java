import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        String[] list = reader.readLine().split(" ");
        int[] arr = new int[N];
        for(int i= 0;i<N;i++){
            arr[i] =Integer.parseInt(list[i]);
        }

        long sum = 0;
        long lcm = LCM(arr);
        for(int i1 = 0 ;i1<N;i1++){
            sum=sum+ lcm/(arr[i1]);
            if(sum>=1000000007) sum%=1000000007;
        }
        System.out.println(sum);
    }
    public static long LCM(int[] arr){
        long res = lcm(arr[0],arr[1]);
        for(int j = 2;j<arr.length;j++){
            res=lcm(res,arr[j]);
        }
        return res;
    }
    public static long lcm(long a, long b){
        long res = a*b/gcd(a,b);
        return res;
    }
    public static long gcd(long a, long b){
        while(b>0){
            long emp =b;
            b=a%b;
            a=emp;
        }
        return a;
    }

}
