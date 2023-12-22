import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
   long A[]=new long[N];

   for(int i=0;i<N;i++){A[i]=scan.nextLong();}
long M=0;
   for(int i=0;i<N;i++){
       for(int j=0;j<i;j++){
  M=M+A[i]*A[j];
  M=M%1000000007;
       }
   }
System.out.println(M);
        }

}
