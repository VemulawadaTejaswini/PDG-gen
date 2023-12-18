import java.io.*;
import java.util.*;

class B{
    public void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arg = br.readLine().split("");
        System.out.printf("%s%d%s\n", arg[0], arg.length - 2, arg[arg.length - 1]);

    }
    public static void main(String... args) throws IOException{
        new B().run();
    }
}