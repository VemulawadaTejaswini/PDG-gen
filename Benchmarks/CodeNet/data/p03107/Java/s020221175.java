import java.util.Scanner;

public class Main{
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String S=sc.next();
	 int index=0;
	 int result=0;
	 while(true) {
		 boolean f01=S.contains("01");
		 boolean f10=S.contains("10");
		 if(!f01&&!f10) {
			 break;
		 }
		 else {
			 if(S.contains("10")) {
				 int index1=S.indexOf("10");
				 if(index1==0) {
					 S=S.substring(index1+1);
				 }else {
					 S=S.substring(0,index1)+S.substring(index1+1);
				 }
				 
			 }
			 if(S.contains("01")) {
				 int index1=S.indexOf("01");
				 if(index1==0) {
					 S=S.substring(index1+1);
				 }else {
					 S=S.substring(0,index1)+S.substring(index1+1);
				 }
				 
				 
			 }
			 
			 result+=2;
		 }
		 
	 }
	 System.out.println(result);
 }
	


}

