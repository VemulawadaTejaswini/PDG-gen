
import java.util.Scanner;

class Main{
	public static void main(String[] main) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();


		boolean isC=false;
		boolean caps=true;
		boolean isA=false;

		if(a.length()>4) {
			for(int i=0; i<a.length(); i++) {
				if(i==0) {
					if(a.charAt(i)=='A') {
						isA=true;
					}
					else {
						isA=false;
					}
				}
				else if(i==2) {
					if(a.charAt(i)=='C') {
						isC=true;
					}
				}

				else if(i==a.length()-2) {
					if(a.charAt(i)=='C' && isC==false) {
						isC=true;
					}
					else if(a.charAt(i)!='C' && isC==true) {
						isC=true;
					}
					else {
						isC=false;
					}
				}

				else {
					if(((a.charAt(i)+"").toLowerCase().equals(a.charAt(i)+""))) {
						//
					}
					else {
						caps=false;
					}
				}
			}

			if(caps==true && isC==true && isA==true) {
				System.out.println("AC");
			}
			else {
				System.out.println("WA");
			}
		}
		else if(a.length()==4) {

			for(int i=0; i<a.length(); i++) {
				if(i==0) {
					if(a.charAt(i)=='A') {
						isA=true;
					}
					else {
						isA=false;
					}
				}
				else if(i==2) {
					if(a.charAt(i)=='C') {
						isC=true;
					}
				}

				else {
					if(((a.charAt(i)+"").toLowerCase().equals(a.charAt(i)+""))) {
						//
					}
					else {
						caps=false;
					}
				}
			}

			if(caps==true && isC==true && isA==true) {
				System.out.println("AC");
			}
			else {
				System.out.println("WA");
			}

		}
	}
}