import java.io.*;
public class Main {
public static void main(String args[]) throws IOException {
BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
while(true){
String s = r.readLine();
if(s == null) break;
int i = s.indexOf(" ");
System.out.println(gcd(Integer.valueOf(s.substring(0, i))) + " " + lcm(Integer.valueOf(s.substring(i+1))));
}
}
private int gcd(int a, int b) {
if(b == 0) return a;
return gcd(b, a % b);
}
private int lcm(int a, int b) {
return b * a / gcd(a, b);
}
}