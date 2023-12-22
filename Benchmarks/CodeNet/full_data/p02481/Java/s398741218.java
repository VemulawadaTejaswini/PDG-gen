import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
        		new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strs = line.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        System.out.println(a*b + " " + (a+b)*(a+b));
    }
}