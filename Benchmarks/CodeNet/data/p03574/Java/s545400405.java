import java.util.Scanner;
public class Main {
	public static int C(char a) {
		if(a=='#') {
		return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String c[]=new String[a];
		String d[][]=new String[a+1][b+1];
		for(int i=0;i!=a;i++) {
			c[i]=scan.next();
		}
		for(int i=0;i!=a;i++) {
			for(int j=0;j!=b;j++) {
				int count=0;
				if(c[i].charAt(j)=='#') {
					d[i][j]="#";
					continue;
				}
				else {
					if(j==0&&i==0) {
						if(b!=1) {
							count+=C(c[i].charAt(j+1));
							if(a!=1) {
								count+=C(c[i+1].charAt(j));
								count+=C(c[i+1].charAt(j+1));	
							}
							}
						else {
							if(a!=1) {
								count+=C(c[i+1].charAt(j));
							}
						}
					}
					else if(j==b-1&&i==a-1){
						if(a!=1) {
							if(b!=1){
								count+=C(c[i].charAt(j-1));
							}
							count+=C(c[i-1].charAt(j));
							count+=C(c[i-1].charAt(j-1));
						}
					}
					else if(j==0&&i==a-1) {
						if(b!=1) {
							count+=C(c[i-1].charAt(j+1));
							count+=C(c[i].charAt(j+1));
						}
						count+=C(c[i-1].charAt(j));
					}
					else if(j==b-1&&i==0){
						if(a!=1) {
							count+=C(c[i+1].charAt(j));
							count+=C(c[i+1].charAt(j-1));
						}
						count+=C(c[i].charAt(j-1));
					}
				else if(j==0) {
					if(b!=1) {
						count+=C(c[i+1].charAt(j+1));
						count+=C(c[i].charAt(j+1));
						count+=C(c[i-1].charAt(j+1));
						}
					count+=C(c[i+1].charAt(j));
					count+=C(c[i-1].charAt(j));
				}
				else if(i==0) {
					if(a!=1) {
						count+=C(c[i+1].charAt(j+1));
						count+=C(c[i+1].charAt(j));
						count+=C(c[i+1].charAt(j-1));
					}
					count+=C(c[i].charAt(j+1));
					count+=C(c[i].charAt(j-1));
				}
				else if(j==b-1) {
					count+=C(c[i].charAt(j-1));
					count+=C(c[i-1].charAt(j));
					count+=C(c[i-1].charAt(j-1));
					count+=C(c[i+1].charAt(j));
					count+=C(c[i+1].charAt(j-1));
				}
				else if(i==a-1) {
					count+=C(c[i].charAt(j-1));
					count+=C(c[i].charAt(j+1));
					count+=C(c[i-1].charAt(j-1));
					count+=C(c[i-1].charAt(j));
					count+=C(c[i-1].charAt(j+1));
				}
				else {
					count+=C(c[i].charAt(j-1));
					count+=C(c[i].charAt(j+1));
					count+=C(c[i+1].charAt(j-1));
					count+=C(c[i+1].charAt(j));
					count+=C(c[i+1].charAt(j+1));
					count+=C(c[i-1].charAt(j-1));
					count+=C(c[i-1].charAt(j));
					count+=C(c[i-1].charAt(j+1));
				}
					d[i][j]=String.valueOf(count);
				}
			}
		}
		for(int i=0;i!=a;i++) {
			for(int j=0;j!=b;j++) {
			System.out.print(d[i][j]);	
			}
			System.out.println();
			}
	}
}