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
        int sum=0;
        int c=0;
        while(true){
            if(sum==legs || c==animals)
                break;
            if(legs-sum<4 && c==animals-1)
                sum+=4;
            else
                sum+=2;
            c++;
        }
        if(sum==legs)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
