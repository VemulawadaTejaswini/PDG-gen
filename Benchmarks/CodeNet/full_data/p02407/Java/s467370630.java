import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int c = 0;
            int count = 0;
            while((line = stdReader.readLine()) != null) {
                if(c == 0) {
                    count = Integer.parseInt(line);
                    c++;
                    continue;
                }
                
                // ?????????????§???????????????§????????????????????\??????
                String[] array = line.split(" ", 0);
                
                // ????????????????????\????????????
                String[] invArray = new String[count];
                int inv = count - 1;
                for(int i = 0; i < count; i++) {
                    invArray[inv - i] = array[i];
                }
                
                // ??\???????????????????????¨?????????
                for(int j = 0; j < count; j++) {
                    System.out.print(invArray[j]);
                    if(j != (count-1)) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                c = 0;
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}