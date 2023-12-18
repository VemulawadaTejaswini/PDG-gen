import java.util.*;
import java.io.*;

class Main{
    public void run() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().substring(0, 4);
        if(str == "YAKI")
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String... args) throws Exception{
        new Main().run();
    }
}
