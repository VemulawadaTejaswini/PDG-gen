import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader height, width;
        height = new BufferedReader(
                new InputStreamReader(System.in));
        width = new BufferedReader(
        		new InputStreamReader(System.in));
        int a = Integer.parseInt(height.readLine());
        int b = Integer.parseInt(width.readLine());
        System.out.println(a*b + " " + (a+b)*(a+b));
    }
}