import java.util.Scanner;

public class mm {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans[]=new String[n];
		for(int i=0;i<n;i++){
		String s=sc.next();
		String ss[]=s.split(":");
		int h=Integer.parseInt(ss[0]);
	    int m=Integer.parseInt(ss[1]);
	    int k=Math.abs(60*h+m-12*m);
	    
	    if(k<60 || k>660 ){ans[i]="alert";}
	    else if(k>=180 && k<=540){ans[i]="safe";}
	    else {ans[i]="warning";}     
		
		}
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
		}
		}