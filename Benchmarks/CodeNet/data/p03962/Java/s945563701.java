
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) throws Exception {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
String[] list = line.split(" ");

int count =3;

for (int i=0;i<2;i++){
if(list[i]. equals(list[i+1])){
count--;
}
}
System. out. println(count);
}}