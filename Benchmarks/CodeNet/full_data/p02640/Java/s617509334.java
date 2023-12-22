import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int animals=Integer.parseInt(st.nextToken());
        int legs=Integer.parseInt(st.nextToken());
        int A=0;
        int B=0;
        A=((4*animals)-legs)/2;
        B=(legs-(2*animals))/2;
        if(A+B==animals && 2*A+4*B==legs && A>=0 && B>=0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
