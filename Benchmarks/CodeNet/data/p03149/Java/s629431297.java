import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long [] n= {0,0,0,0};
		n[0]=sc.nextLong();
		n[1]=sc.nextLong();
		n[2]=sc.nextLong();
		n[3]=sc.nextLong();
		int i;int c=0;
		for(i=0;i<4;i++) {
			if(n[i]==1) {c++;}
			if(n[i]==9) {c++;}
			if(n[i]==7) {c++;}
			if(n[i]==4) {c++;}
		}
		if(c==4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
