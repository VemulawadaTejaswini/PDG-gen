import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++)
        {
            String ss = br.readLine();
            hm.put(ss , hm.getOrDefault(ss , 0)+1);
        }
        out.println("AC x " + hm.getOrDefault("AC" , 0) );
        out.println("WA x "  + hm.getOrDefault("WA" , 0));
        out.println("TLE x " + hm.getOrDefault("TLE" , 0) );
        out.println("RE x " + hm.getOrDefault("RE" , 0) );

        out.flush();
        out.close();

    }

    static class pair{
        long x1;
        long x2;

        public pair(long x1 , long x2)
        {
            this.x1 = x1;
            this.x2 = x2;
        }

    }

}
