import java.util.Arrays;
import java.util.Scanner;
  
class Main{
    public static void main(String[] a){
int[] s = new int[9];
Scanner sc = new Scanner(System.in);
for (int c = 0; c < 10; c++) {
s[c] = Integer.valueOf(sc.nextLine());
}
Arrays.sort(s);
System.out.print(String.format("%d\n%d\n%d", s[9], s[8], s[7]));
    }
}