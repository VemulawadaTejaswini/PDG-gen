import java.io.*;

public class Main{
public static void main(String [] args) throws IOException{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


long x = Integer.parseInt(reader.readLine());

x = Math.pow(x,3);


System.out.print(x);


}
}

