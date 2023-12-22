import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s);

        if(a < b){
          System.out.println(a + "<" + b);
        }
        else if(a > b){
          System.out.println(a + ">" + b);
        }
        else if(a == b){
          System.out.println(a + "==" + b);
        }
    }
}