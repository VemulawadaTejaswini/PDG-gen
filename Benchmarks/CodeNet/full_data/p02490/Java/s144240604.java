import java.util.*;
import static java.util.Arrays.*;
class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
while(true) {
int[] xy = new int[]{in.nextInt(), in.nextInt()};
if((xy[0]|xy[1])==0) break;
sort(xy);
System.out.println(xy[0] + " " + xy[1]);
}
}
}