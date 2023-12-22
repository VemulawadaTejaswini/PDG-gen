//java 10028 programing A

import java.util.*;

public class Main{
public static void main(String[] args) {
Scanner sin = new Scanner(System.in);
int n = sin.nextInt();
int[] b = new int[n];
for (int i = 0; i < b.length; i++) {
b[i] = sin.nextInt();
}
// ?????????????????????????????????
Arrays.sort(b);
System.out.print(b[0]);
for(int j=1;j<(n);j++) {
System.out.print(" " + b[j]);
}
System.out.println();
}
}