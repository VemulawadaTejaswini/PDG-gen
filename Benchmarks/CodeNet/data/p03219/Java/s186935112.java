import java.util.*;
public class Main
{
        public static void main(String args[])
        {
int x;
int y;
int ans;
Scanner scanner = new Scanner(System.in);
String sx = scanner.next();
String sy = scanner.next();
x = Integer.parseInt(sx);
y = Integer.parseInt(sy);
ans = x + y/2;
System.out.println(ans);
}
}