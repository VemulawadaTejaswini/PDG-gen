import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int [] hairetu1 = new int[9];
	int [] hairetu2 = new int[9];
	int [] hairetu3 = new int[9];
	hairetu1[0]=1;
	for(int i=1;i<8;) {
		hairetu1[i]=hairetu1[i-1]*10; 
	}
	for(int i=7;i>=0;i--) {
		hairetu2[i]=N/hairetu1[i];
		N=N%hairetu1[i];
	}
	int sum=0;
	for(int i=0;i<9;i++) {
		sum=sum+hairetu2[i];
	}
	if(N%sum==0){
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	}
}
