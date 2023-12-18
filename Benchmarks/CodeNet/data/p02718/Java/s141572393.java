import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int N = scan.nextInt();
 int M = scan.nextInt();
 int PV[] = new int[N];
 double b = 0;
 int count = 0;
  //4M分の1
  for (int i = 0; i < N; i++){
    int a = scan.nextInt();
    PV[i] = a;
        b = b + a;
  }
    b = b /( 4 * M ); 

  //M個選べるか
  for (int i = 0; i < N; i++){
   if ( PV[i] >= b ){
     count += 1;
   }
   else {
   }
  }

  if ( count >= M ){
    System.out.println("Yes");
  }
  else{
    System.out.println("No");
  }
 }
}