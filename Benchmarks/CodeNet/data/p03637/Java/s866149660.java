import java.io.*;
import java.util.*;

class Main{
    public void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arg = br.readLine().split(" ");
        List<String> four = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> othe = new ArrayList<>();
        for(String a : arg){
            if(Integer.parseInt(a) % 4 == 0)
                four.add(a);
            else if(Integer.parseInt(a) % 2 == 0)
                two.add(a);
            else
                othe.add(a);
        }
        if(four.size() >= othe.size() - 1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    public static void main(String... args) throws IOException{
        new Main().run();
    }
}
