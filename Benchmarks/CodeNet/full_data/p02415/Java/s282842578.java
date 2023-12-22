import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        byte[] data = r.readLine().getBytes();
        for(int i = 0; i < data.length; i++){
            if(data[i] >= 65 && data[i] <= 90) System.out.print((char)(data[i] + 32));
            else if(data[i] >= 97 && data[i] <=122) System.out.print((char)(data[i] - 32));
            else System.out.print((char)(data[i]));
        }
        System.out.println();
    }
}

