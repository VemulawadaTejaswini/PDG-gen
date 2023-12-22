import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int y , x;
        int sum = 0;
        String input = br.readLine();
        x = Integer.parseInt(input);
        String[] list = br.readLine().split(" ");
        int ma = Integer.parseInt(list[0]);
        int mi = Integer.parseInt(list[0]);
        for (int i = 0; i < x; i ++)
        {
        	y = Integer.parseInt(list[i]);
        	ma = Math.max(ma, y);
        	mi = Math.min(mi, y);
        	sum += y;
        }	
        System.out.println(mi +" " +  ma +" " + sum);
	}

}