import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] a = new int[n];
   boolean flag = false;

   for(int i=0;i<n;i++) {
	   if(a[i]/2==0&&((a[i]%3)==0)||((a[i]%5)==0)) {
		   flag=true;
	   }	   
   }
   if(flag=true) {
	   System.out.println("APPROVED");
   }
   else {
	   System.out.println("DENIED");
   }
 }
}