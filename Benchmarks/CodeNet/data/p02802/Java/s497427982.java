import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
static int T,N,M,K,sum=0,x,correct=0,wrong=0,p;
static char action;
    static HashSet<Integer> values = new HashSet<>();
    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        while (M-->0){
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            action = st.nextToken().charAt(0);
            if(action=='W'){
                if (!values.contains(p))
                    wrong++;

            }else{
                if (!values.contains(p)){
                    correct++;
                    values.add(p);
                }
            }
        }
        pw.println(correct+" "+wrong);pw.flush();
    }
}
