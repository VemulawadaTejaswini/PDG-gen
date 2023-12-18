import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] like = new int[N+1];
        like[0] = -1;
        for(int i=1;i<=N;i++) like[i] = Integer.parseInt(line[i-1]);
        int count = 0;
        for(int i=1;i<=N;i++){
        	if(like[like[i]]==i) count++;
        }
        int answer = count/2;
        System.out.println(answer);
    }
}