import java.util.Scanner;
class Main{
 static public void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int A = scan.nextInt();
   int B = scan.nextInt();
   int K = scan.nextInt();
   for (int i= 0;i<k;i++){
     if(A==0 && B==0) break;
     else if(A>=1) A--;
     else B--;
  }
   System.out.println(A + " " + B);
 }
}