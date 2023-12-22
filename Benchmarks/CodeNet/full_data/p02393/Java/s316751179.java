import java.util.*;
class Main {
public static void main(String[]args)throws Exception {
Scanner sc = new Scanner(System.in);
int [] as = new int[3];
for(int i = 0; i < 3; i++) as[i] = sc.nextTnt();
Arrays.sort(as);
for(int i = 0; i < 3; i++) Sysem.out.print((i>0 ? " ":"") + as[i]);
System.out.println();
}
}