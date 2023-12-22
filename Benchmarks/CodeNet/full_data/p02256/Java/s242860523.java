import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int tmp;
        if(x<y){
        	tmp=x;
        	x=y;
        	y=tmp;
        }
        while(x%y>0) {
        	tmp=y;
        	y=x%y;
        	x=tmp;
        }
        out.println(y);
        out.flush();
    }

    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}