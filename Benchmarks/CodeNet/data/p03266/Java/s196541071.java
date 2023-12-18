import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int count = 0;

for(int a=1;a<=n;a++) {
	for(int b=1;b<=n;b++) {
		if((a+b)%k != 0) {
			continue;
		}
		for(int c=1;c<=n;c++) {
		if((a+c)%k != 0) {
			continue;
		}
		if((b+c)%k != 0) {
			continue;
		}
		count++;
		}
	}
}

System.out.println(count);

sc.close();
	}

}