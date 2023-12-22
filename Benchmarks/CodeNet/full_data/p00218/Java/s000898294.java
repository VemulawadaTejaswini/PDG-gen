import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			char c[]=new char[n];
			for(int i=0;i<n;i++){
				int pm=sc.nextInt();
				int pe=sc.nextInt();
				int pj=sc.nextInt();
				if(pm==100||pe==100||pj==100)c[i]='A';
				else if((pm+pe)/2>=90)c[i]='A';
				else if((pm+pe+pj)/3>=80)c[i]='A';
				else if((pm+pe+pj)/3>=70)c[i]='B';
				else if((pm+pe+pj)/3>=50&&(pm>=80||pe>=80))c[i]='B';
				else c[i]='C';
				System.out.println(c[i]);
			}
		}
	}
}