import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
Integer a[] = new Integer[N];
Integer b[] = new Integer[N];
for(int i=0;i<N;i++){
a[i]= sc.nextint();
b[i]= a[i];
}
Arrays.sort(a, Comparator.reverseOrder());
for(int i=0;i<N;i++){
if(a[0]==b[i]){
System.out.println(a[1]+"¥n");
}else{
System.out.println(a[0]+"¥n");
}
}
}
}