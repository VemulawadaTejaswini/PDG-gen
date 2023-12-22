import java.util.Scanner;

public class Main{
	  public static void judge(int m,int f,int r) {
		  if(m==-1 && f==-1 && r==-1) {
			  System.exit(0);
		  }
		  if(m==-1 || f == -1) {
			  System.out.print("F");
		  }else {
	
		  if(m+f>=80) {
		 
		  System.out.print("A");
	      }
		  else if(m+f<80 && m+f>=65) {
			
		  System.out.print("B");
	      }
		  else  if(m+f<65 && m+f>=50) {
			 
		  System.out.print("C");		 
	      }
		  else if(m+f<50 && m+f>=30 && r<50) {
			
		  System.out.print("D");
		  }else if(r>=50) {
			 
		  System.out.print("C");
		  }
		  else  if(m+f<30 || r!=-1) {
			  
		  System.out.print("F");
		  }
		  
		  }
	}
		  
	  public static void main(String[] args) {
		  Scanner x = new Scanner(System.in);
		  for(;;) {
		  int data [] = new int[3];
		  for(int i = 0;i<3;i++) {
				data[i]=x.nextInt();
			}		 
		 judge(data[0],data[1],data[2]);
		 System.out.println();
		  }
	  }
	}
