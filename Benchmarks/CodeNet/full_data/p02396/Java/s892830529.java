import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine());
        for(int i=1;i<=1000;i++){
            int num=Integer.parseInt(reader.readLine());
            if(num==0){
            	break;
            }
        	System.out.println("Case " + i + ": " +num);
        }
	}
}