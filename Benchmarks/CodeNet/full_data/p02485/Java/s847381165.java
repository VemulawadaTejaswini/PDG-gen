import java.io.*;

public class Main {
public static void main(String[] args) {
String num = null;
System.out.print("??£?????´??°:");
try {
num = new BufferedReader(new InputStreamReader(System.in)).readLine();
} catch (IOException e) {
}

int sum = 0;
for (int i = 0; i < num.length(); i++) {
int value = Character.getNumericValue(num.charAt(i));
if (value < 0) {
return;
}
sum += value;
}
if (sum == 0) {
return;
}

System.out.println(sum);
}
}