import java.util.*;
public class Main {
public static void main(String...args) {
final Scanner sc = new Scanner(System.in);
System.out.println(Integer.bitCount(Math.abs(sc.nextInt())) + Integer.bitCount(Math.abs(sc.nextInt())));
}
}