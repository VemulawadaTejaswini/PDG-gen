import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {

BufferedReader br =new BufferedReader (new InputStreamReader (System.in));

String line = br.readLine( );
String[] list = line.split(" ");
int a = Integer.parseInt(list[0]);
int b = Integer.parseInt(list[1]);
int c = Integer.parseInt(list[2]);

System. out. println((a+b)*c/2);
}}
