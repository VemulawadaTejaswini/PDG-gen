import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
Integer U[] = new Integer[N];
for(int i=0;i<N;i++){
U[i] = sc.nextInt();
}
float f = U[0];
Arrays.sort(U);
for(int i=1;i<N;i++){
f=f+U[i];
f=f/2;
}
System.out.println("f");
}
}