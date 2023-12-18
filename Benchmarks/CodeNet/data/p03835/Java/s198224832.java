import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int x, y, z;
		int count = 0;

		for(x=k;x>=0;x--){
			if(s-x<=2*k){
				if(s-x>=k){
					for(y=k;y>=0;y--){
						if(s-x-y<=k)count++;
					}
				}
				else count+=s-x+1;
			}
		}
		System.out.println(count);
	}

}
