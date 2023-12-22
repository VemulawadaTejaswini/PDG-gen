
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{//change to Main
    static int INF = Integer.MAX_VALUE;
    static int[][] near = {{0,0,1,-1},{1,-1,0,0}};
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//
    static StringTokenizer st;
    static StringBuilder sb;
    static String line;

    public static void main(String[] args) throws Exception {
        //int T = Integer.parseInt(in.readLine());//number of messages
        int T =1;
        for (int t = 0; t < T; t++) {
            solve();
            //st = new StringTokenizer(in.readLine());
            //int x = Integer.parseInt(st.nextToken());

        }//forLoop#1
    }//main

    public static void solve() throws Exception{

        char[] cars = {'a','b','c','d','e','f','g','h',
                'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        while((line = in.readLine())!=null){
            char[] buf = line.toCharArray();
            String s;

            for (int k = 0; k < 26; k++) {//k is key
                s = "";
                for (int i = 0; i < buf.length; i++) {
                    if(buf[i]>='a'&&buf[i]<='z')
                        {s+=(char)((buf[i]-'a'+k)%26+'a');}else{
                        s+=buf[i];
                    }//check next possible key
                }

                if (s.contains("the")||s.contains("this")||s.contains("that")){
                    System.out.println(s);
                    break;
                }
            }

        }


    }
}//class