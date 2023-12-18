import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
String line = br.readLine();
int x=Integer. parseInt(line);
int y=0;

for(int i=1;i<x+1;i++){
y=y+i;
}
System. out. println(y);
}}
		