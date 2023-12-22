import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) {
    try {
BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(stdReader.readLine());
int[] rlt = new int[2];
rlt[0] = 0;
rlt[1] = 0;
for (int i = 0; i < n; i++) {
String line = stdReader.readLine();
String[] in = line.split(" ");
int r = in[0].compareToIgnoreCase(in[1]);
if (r > 0) {
rlt[0] += 3;
} else if (r == 0) {
rlt[0] += 1;
rlt[1] += 1;
} else if (r < 0) {
rlt[1] += 3;
}
}
System.out.println(rlt[0] + " " + rlt[1]);
} catch (Exception e) {
System.out.println(e);
System.exit(-1);
}
}
}