import java.io.*;
 
public class Main {
 
public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String line;
 
while ((line = br.readLine()) != null) {
 
String[] data = line.split(" ");
 double[] d = new double[data.length];
 
for (int i = 0; i < d.length; i++) {
 d[i] = Double.parseDouble(data[i]);
 }
 
double x = (d[2] * d[4] - d[5] * d[1]) / (d[0] * d[4] - d[3] * d[1]),
 y = (d[0] * d[5] - d[3] * d[2]) / (d[0] * d[4] - d[3] * d[1]);
 
x = Math.round(x * 1000) / (double) 1000;
 y = Math.round(y * 1000) / (double) 1000;
 
System.out.printf("%.3f %.3f\n", x, y);
 }
 }
 }