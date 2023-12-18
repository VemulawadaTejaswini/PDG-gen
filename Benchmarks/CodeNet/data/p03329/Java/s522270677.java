
import java.util.Scanner;
public class Main {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int nine=0;
		int cntsix=10000;
		int cnt=0;
		int cntnine=10000;
		double tmp=A;
		int i=1;
		int j=9;
		while(true) {
			if(Math.pow(9,i)>tmp&&i<=cntnine&&i!=1&&tmp>81) {
			if(Math.pow(6,i)<tmp) {tmp-=Math.pow(6, i);cnt++;cntnine=i;
			//System.out.println("6pow:i="+i);
			i=1;}
			else {
				tmp-=Math.pow(9, i-1);cnt++;
			//System.out.println("9:"+(i-1));
			//System.out.println(tmp);
			cntnine=i;i=1;
			}

			}
			else if(Math.pow(6,i)>tmp&&i<=cntsix&&i!=1&&tmp>=36) {tmp-=Math.pow(6, i-1);cnt++;
			//System.out.println("6:"+tmp);
			cntsix=i;i=1;
			}
			else {i++;}
			if(tmp<36) {break;}
		}
		while(true) {
			if(tmp>=9*j) {tmp-=9;cnt++;}
			else if(tmp>=6*j) {tmp-=6;cnt++;}
			if(tmp<6) {break;}
			j--;
		}
		int c=(int)tmp;
			System.out.println(cnt+c);
			//System.out.println(tmp);
	}
	}
