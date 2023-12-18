import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// nこの希望
		int ans = 0;
		int x = 1;

		int y=1;
		int d,k;
k=0;
while(n>5){


		while (x < n) {
			x = x * 9;

		}
		if (x > n) {
			x = x / 9;

		}
		while (y < n) {
			y = y * 6;

		}
		if (y > n) {
			y = y / 6;

		}

		d=Math.max(x,y);

while(n>k){
	k+=d;
ans++;
}
if(n<k){
k=k-d;
ans--;
}
n=n-k;

x=1;
y=1;
k=0;
System.out.println(n+"#"+ans+"#"+d+"#"+k);
}

System.out.println(ans+n);

	}
}