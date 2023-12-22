import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) {
try {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();

int a = Integer.parseInt(str);
int h = a/3600;
int m = (a-(3600*h) )/60;
int s = (a-(3600*h)-(m*60));

System.out.println(h+":"m+":"+s);
}

}