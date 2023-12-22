import java.util.*;
import static java.util.Arrays.*;
class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
char[] n = in.next().toCharArray();
sort(n);
StringBuilder ans = new StringBuilder();
for(int i = 0; i < n.length; i++) ans.append(n[i]).append(" ");
System.out.println(ans.toString().trim());
}}