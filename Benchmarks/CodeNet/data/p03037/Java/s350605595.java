import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int num[] = new int[100001];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            for(int j=L;j<=R;j++){
                num[j]++;
            }
        }
        int count = 0;
        for(int i=1;i<=100000;i++){
            if(num[i]==M){
                count++;
            }
        }
        System.out.println(count);

    }
}
