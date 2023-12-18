import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC  {
	public static void main(String[] args)throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        int S = (a+b)*h/2;
        System.out.print(S);
	}
}