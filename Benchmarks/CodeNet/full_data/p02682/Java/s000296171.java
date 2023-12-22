import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> num=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        if(k>=a){
            sum+=a;
            k-=a;
        }
        if(k<=b){
            k=0;
        }
        else{
            k-=b;
        }
        if(k<=c){
            sum+=k*-1;
            k=0;

        }
        System.out.println(sum);
    }
}
