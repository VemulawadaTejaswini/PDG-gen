import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int n = sc.nextInt();
int[] x = new int[n];
int[] y = new int[n];
for(int i = 0; i < n; i++){
x[i] = a + i;
y[i] = b - i;
}
Arrays.sort(y);
for(int i : x){
System.out.println(i);
}
for(int i : y){
System.out.println(i);
}
}
}