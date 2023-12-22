import java.io.*;

class HelloServlet {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        int i = Integer.parseInt(s);
        if(i > 0 || i < 101){
        	System.out.print(i * i * i);
        }
        
    }
}
