import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
 if(A==1) {
	A=14;
  }
 if(B==1) {
	B=14;
  }
 String ans="";
 if(A>B) {
	ans="Alice";
  }
 if(A<B) {
 ans="Bob";
  }
 if(A==B) {
	ans="Draw";
 }

System.out.println(ans);
 }
}