import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        final SimpleDateFormat df = new SimpleDateFormat("H:mm");
        
        if (input.length == 5) {
            int StartH = Integer.parseUnsignedInt(input[0]);
            int StartM = Integer.parseUnsignedInt(input[1]);
            int EndH = Integer.parseUnsignedInt(input[2]);
            int EndM = Integer.parseUnsignedInt(input[3]);
            int Dur = Integer.parseUnsignedInt(input[4]);
   
            final  long startD = df.parse(StartH + ":" + (StartM <10? StartM+"0":StartM)).getTime();
            final long  EndD = df.parse(EndH + ":" + (EndM <10? EndM+"0":EndM)).getTime();
   
            long diff = (EndD - startD) /1000;
            diff = diff/ 60;
            System.out.println(diff - Dur);
  
        } else {
            System.out.println("Error!");
        }
    }
}
