import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
                new InputStreamReader (System.in));
        String line=br.readLine();
        String[] str = line.split(" ");
        int a=Integer.parseInt(str[0]);
	
	int zkn = a / 3600;
	int hun = (a % 3600 ) / 60;
	int byo = a % 60
       
        System.out.println(zkn ":" hun ":" byo":");
    }
}