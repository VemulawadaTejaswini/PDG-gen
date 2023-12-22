import java.util.Scanner;
class Main {
&#160; public static void main(String[] args) {
&#160; &#160; Scanner stdin = new Scanner(System.in);
&#160; &#160; int in = 0;
&#160; &#160; StringBuilder a = new StringBuilder();
&#160; &#160; StringBuilder b = new StringBuilder();
&#160; &#160; int pointA, pointB, temp;
&#160; &#160; pointA = pointB = 0;
&#160; &#160;&#160;
&#160; &#160; try {
&#160; &#160; &#160; in = stdin.nextInt();
&#160; &#160; } catch (Exception e) {
&#160; &#160; &#160; e.printStackTrace();
&#160; &#160; &#160; in = 0;
&#160; &#160; }
&#160; &#160; for (int i = 0; i < in; ++i) {
&#160; &#160; &#160; try {
&#160; &#160; &#160; &#160; a.append(stdin.next());
&#160; &#160; &#160; &#160; b.append(stdin.next());
&#160; &#160; &#160; } catch (Exception e) {
&#160; &#160; &#160; &#160; e.printStackTrace();
&#160; &#160; &#160; }
&#160; &#160; &#160; temp = a.toString().compareTo(b.toString());
&#160; &#160; &#160; if (temp < 0) {
&#160; &#160; &#160; &#160; pointB += 3;
&#160; &#160; &#160; } else if (temp > 0) {
&#160; &#160; &#160; &#160; pointA += 3;
&#160; &#160; &#160; } else {
&#160; &#160; &#160; &#160; ++pointA;
&#160; &#160; &#160; &#160; ++pointB;
&#160; &#160; &#160; }
&#160; &#160; &#160; a.delete(0, a.length());
&#160; &#160; &#160; b.delete(0, a.length());
&#160; &#160; }
&#160; &#160; System.out.println(a + " " + b);
&#160; }
}