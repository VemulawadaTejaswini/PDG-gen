import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int p=scan.nextInt();
		for(int i=0;i<p;i++) {
			String str1=scan.next();
			int a=scan.nextInt();
		                int b=scan.nextInt();
		                int c=str.length();
		                String str3=str.substring(a,b+1);
		                String str4="";
		                if(str1.equals("replace")) {
		                    String str2=scan.next();
		                    String sa=str.substring(0,a);
		                    String sb=str.substring(b+1,c);
		                    str=sa+str2+sb;
		                }else if(str1.equals("reverse")) {
		                    for(int i1=str3.length()-1;i1>=0;i1--) {
		                    str4=str4+str3.charAt(i1);
		                    }
		                    String sa=str.substring(0,a);
		                    String sb=str.substring(b+1,p);
		                    str=sa+str4+sb;
		                }else if(str1.equals("print")) {
		                    System.out.println(str3);
		                }
		            }
		            scan.close();
		  }
	}
