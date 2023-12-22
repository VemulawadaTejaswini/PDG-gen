import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();

   Set<String> set = new HashSet<>();
for (int i = 0; i < n; i++) {
set.add(kbd.next());}

System.out.println(set.size());
}

}
