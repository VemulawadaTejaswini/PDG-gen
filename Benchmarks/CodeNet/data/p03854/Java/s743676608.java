import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.next();
String[] mtc = {
"eraser",
"dream",
"erase",
"dreamer"
};
while (str.length() != 0) {
int n = str.length();
for (int i = 0; i < mtc.length; i++) {
String s = new String(str);
s = s.length() >= mtc[i].length()
? s.substring(s.length() - mtc[i].length(),
s.length())
: "";
if (s.equals(mtc[i])) {
str = str.substring(0, str.length() - mtc[i].length());
}
}
if (n == str.length()) {
System.out.println("No");
break;
}
}
if (str.length() == 0) {
System.out.println("Yes");
}
}
}