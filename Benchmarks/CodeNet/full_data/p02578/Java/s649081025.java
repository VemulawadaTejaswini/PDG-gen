import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        PriorityQueue<Integer> desc=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> asc=new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int temp=Integer.parseInt(st.nextToken());
            desc.add(temp);
            asc.add(temp);
        }
        System.out.println((desc.poll()-asc.poll()));

    }
}
