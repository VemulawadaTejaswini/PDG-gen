import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   String[] A= new String[n+1];
   for(int i=0;i<n;i++){
     A[i]=kbd.next();
}
int x=0;
sortTableByName(A,n);
for(int i=0;i<n;i++){
if(!(A[i].equals(A[i+1]))){
  x=x+1;
}
}
System.out.println(x);
}


public static void sortTableByName(String[] A, int num) {
 String temp;
 for (int i = 0; i < num-1; i++) {
  for (int j = i + 1; j < num; j++) {
   if (A[i].compareTo(A[j]) >0) {
    temp = A[i];
    A[i] = A[j];
    A[j] = temp;
   }
  }
 }
}
}