import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        boolean latitude0, longitude0;
        //if one day he go north and another day go south, he can make plan to end with the latitude where he started
        //if he don't go north or south any day,  the terminal will have the same latitude
        if((line.contains("N")&&line.contains("S")) || (!line.contains("N")&&!line.contains("S"))) latitude0=true;
        else latitude0 = false;
        if((line.contains("E")&&line.contains("W")) || (!line.contains("E")&&!line.contains("W"))) longitude0=true;
        else longitude0 = false;
        
        if(latitude0&&longitude0)System.out.println("Yes");
        else System.out.println("No");
    }
}
