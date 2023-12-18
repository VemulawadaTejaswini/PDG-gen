import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
int l = sc.nextInt();
int r = sc.nextInt();
boolean ok673 = false;
boolean ok3 = false;
if (l%673 == 0 || r%673 == 0) ok673 = true;
if (l%3 == 0 || r%3 == 0) ok3 = true;
if (r/673 - l/673 >0) ok673 = true;
if (r/3 - l/3 >0) ok3 = true;
if (ok673 && ok3) {
System.out.println(0);
} else {
System.out.println((l*(l+1))%2019);
}
    }
}