
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int count = 0;
int count2=0,count3=0;

for(int a=1;a<=n;a++) {
	for(int b=a;b<=n;b++) {
		if((a+b)%k != 0) {
			continue;
		}
		for(int c=b;c<=n;c++) {
		if((a+c)%k != 0) {
			continue;
		}
		if((b+c)%k != 0) {
			continue;
		}
		count++;
		if(a==c) {count3++;}else
		if(a==b || b==c) {count2++;}
		}
	}
}

System.out.println((count*6)-(count2*3)-(count3*5));

sc.close();
	}

}
