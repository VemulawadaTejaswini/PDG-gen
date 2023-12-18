import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[] buf=new int[N];
	for(int i=0;i<buf.length;i++){
		buf[i]=sc.nextInt();
	}
	int max=0;
	for(int j=0;j<N;j++) {
		for(int i=0;i<N;i++) {
			if(i==j) {}
			else {
				if(max<buf[i]) {
					max=buf[i];
				}
			}

		}
		System.out.println(max);
		max=0;
	}

}
}