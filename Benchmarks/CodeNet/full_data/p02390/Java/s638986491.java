import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		 try {
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		 String ln;
		ln = buf.readLine();
		
//       String[] strAry = ln.split(" ");
//       int x = Integer.parseInt(strAry[0]);
//       int y = Integer.parseInt(strAry[1]);
		
       int z = Integer.parseInt(ln);
       int min = z/60;
       int hour = min/60;
       min = min - hour/60;
       int sec = z - hour*3600 - min*60;
       
       System.out.println(hour + ":" + min + ":" +  sec + ":");
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
    }
}