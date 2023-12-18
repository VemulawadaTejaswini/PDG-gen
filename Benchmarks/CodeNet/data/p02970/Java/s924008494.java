import java.util.Scanner;

public class Main{
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt(),D=sc.nextInt();
	 int count=0;
	 int index=0;
	 
	 while(true) {
		 if(index+(2*D+1)>=N) {
			 count++;
			 break;
		 }
		 else {
			 index+=(2*D+1);
			 count++;
		 }
	 }
	 System.out.println(count);
	 
 }
	


}


