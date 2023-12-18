import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main  {
	public static void main(String[] args)throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        System.out.print(K * (X - Y) + N * Y );
	}
}