import java.io.*;

class Main
{
    public static void main (String[] args) throws IOException   
	{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		br.readLine();

        StringBuffer sb = new StringBuffer();
		sb.append(br.readLine());
        System.out.println(sb.reverse());
    }
}