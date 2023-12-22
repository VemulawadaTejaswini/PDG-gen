import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// ?¨??????\??????????????????????????????????????????
Scanner sc = new Scanner(System.in); 
int w = sc.nextInt();
int n = sc.nextInt();
int j = 0, k = 0;

int[] a = new int[w + 1];
for (int i = 0; i <= w; i++) { 
a[i] = i;
}
for (int i = 1; i <= n; i++) {
String[] str = sc.next().split(".");
j = Integer.parseInt(s[0]);
k = Integer.parseInt(s[1]);
a[0] = a[j];
a[j] = a[k];
a[k] = a[0];
}
for(int i = 1; i <= w; i++){
System.out.printf("%d?\n", a[i]);
}
sc.close();