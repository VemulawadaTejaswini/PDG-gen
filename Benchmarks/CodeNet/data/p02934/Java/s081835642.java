import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int f = 0;
Float a[]=new Float[N];
for(i=0;i<N;i++){
f=sc.nextInt();
a[i]=1/f;
}
float sum = java.util.Arrays.stream(a).sum();
float T = 1/sum;
System.out.println(T);
}
}