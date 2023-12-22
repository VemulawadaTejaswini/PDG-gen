import java.util.Arrays;
  
class Main{
    public static void main(String[] a){
String[] s = new String[];
Scanner sc = new Scanner(System.in);
for (int c = 0; c < 10; c++) {
s[c] = sc.nextLine();
}
Arrays.sort(s);
System.out.print(String.format("%d\%d\%d", s[9], s[8], s[7]));
    }
}