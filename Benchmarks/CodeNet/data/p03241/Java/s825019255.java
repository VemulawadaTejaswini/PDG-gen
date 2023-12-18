import java.util.Scanner;
class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int N= sc.nextInt();
int M= sc.nextInt();
int gcd=1;
for(int n=1;n<=M/N;n++) {
   if(N==1) {gcd=M;
   break;
   }
	if(M%n==0) {
	if(n*N<=M) {
	gcd=n;
	break;
	 }
    }	
 }
System.out.println(gcd);
 }
  }
