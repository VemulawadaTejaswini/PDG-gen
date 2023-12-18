import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {

BufferedReader br =new BufferedReader (new InputStreamReader (System.in));

String line = br.readLine( );
int a = Integer.parseInt(line);

System. out. println(800*a-a/15*200);

}}