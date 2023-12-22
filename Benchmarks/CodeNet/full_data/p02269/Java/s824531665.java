import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
 
public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        HashSet<String>set = new HashSet<>();
        for(int i = 1; i <= n; i++){
            String s = cin.next();
            String s2 = cin.next();
            if (s.equals("insert")){
                set.add(s2);
            }else{
                System.out.println(set.contains(s2)?"yes":"no");
            }
        }
    }
}
