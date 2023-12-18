import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = br.readLine().charAt(0);
        switch (c)
        {
            case 'A':
                bw.write("T");
                break;
            case 'C':
                bw.write("G");
                break;
            case 'G':
                bw.write("C");
                break;
            case 'T':
                bw.write("A");
                break;
        }
        bw.close();
    }
}
