import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Watch {
    Integer seconds;
    
    public Watch(Integer seconds) {
        this.seconds = seconds;
    }
    
    public Integer getHours() {
        return  seconds/60/60;
    }
    public Integer getMinutes() {
        return  (seconds/60)%60;
    }
    public Integer getSeconds() {
        return  seconds%60;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();
        String[] splitStrings = inputLine.split("\\s");
        
        if(splitStrings.length != 1) {
            throw new Exception("invalid input");
        }
        
        Watch watch = new Watch(Integer.parseInt(splitStrings[0]));
        System.out.printf("%d:%d:%d\n", watch.getHours(), watch.getMinutes(), watch.getSeconds());
    }
}
