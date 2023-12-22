package test_java;

import java.io.*;

class HelloServlet {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        int i = Integer.parseInt(s);
        if(i < 1 || i > 100){
        	return;
        }
        System.out.print(i * i * i);
    }
}
