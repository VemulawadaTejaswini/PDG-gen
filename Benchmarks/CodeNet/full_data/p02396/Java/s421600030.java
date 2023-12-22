import java.io.*;

class Main {
	public static void main(String argv[]) throws IOException{
        BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
        String aLine;
        long n = 0L;
        
        while(null!=(aLine = fin.readLine())){
            n++;
        }
        fin.close();
        System.out.println("?????°:"+n);
    }
}