import java.util.Scanner;
import java.util.Arrays;
public class Main{
public static void main(String args[]){
int N = 0;
int L[] = new int[200];
int ans = 0;
Arrays.fill(L, 1000);

Scanner scan = new Scanner(System.in);
N = scan.next();
for(int i=0;i<2*N;i++){
L[i] = scan.next();
}
Arrays.sort(a);
for(int i=0;i<2*N;i=i+2){
add = add+L[i];
}
System.out.println(add);
}
}