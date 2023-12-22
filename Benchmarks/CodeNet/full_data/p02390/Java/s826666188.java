import java.io.*;
class Main{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int s = Integer.parseInt(br.readLine());
	int h = s /3600;
	s %= 3600;
	int m = s / 60;
	s %= 60;
	System.out.println(h+":"+m+":"+s);
    }
}