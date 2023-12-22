import java.util.Arrays;
import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
  int A[] = new int[9];
  int n1,n2,n3,caso;
caso=entrada.nextInt();
for(int i=0;i<caso;i++){
n1=entrada.nextInt();
n2=entrada.nextInt();
n3=entrada.nextInt();
A[i]=n1;
A[i]=n2;
A[i]=n3;
    Arrays.sort(A);
if ((n1*n1+n2*n2)==n3*n3)
System.out.println("Yes");else
System.out.println("No");
}
}
}