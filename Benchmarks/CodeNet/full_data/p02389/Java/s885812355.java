import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int a = st.nextToken();
            int b = st.nextToken();
            System.out.println(a*b+" "+2*(a+b));
        }
    }
}