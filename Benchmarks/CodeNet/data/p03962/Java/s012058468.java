import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main  {
	public static void main(String[] args)throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if((a < b)&&(b < c)){
            System.out.print(3);
        }
        else if((a == b)&&(b == c)) {
            System.out.print(1);
        }
        else{
            System.out.print(2);
        }
	}
}
