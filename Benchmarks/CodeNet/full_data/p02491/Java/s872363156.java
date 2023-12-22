import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
      try{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
          String s = r.readLine();
          StringTokenizer st = new StringTokenizer(s," ");
          int a; int b; int x; int y; double z;
        a = Integer.parseInt(st.nextToken().toString());
        b = Integer.parseInt(st.nextToken().toString());
        x = a/b;
        y = a%b;
        z = a/b;
        System.out.println(x + " " + y + " " + z);
      } catch(IOException e){
        System.out.println(e);
      }
      }
    }