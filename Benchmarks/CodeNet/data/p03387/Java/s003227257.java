import java.util.*;
public class Main {
		public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
        int a[] =new int [3];
				a[0] = sc.nextInt();
				a[1] = sc.nextInt();
				a[2] = sc.nextInt();
				Arrays.sort(a);
				if((a[2]-a[0]+a[2]-a[1]) % 2 ==0){
						System.out.println((a[2] - a[0] + a[2] - a[1]) / 2);
				}
				else{
						a[2] += 1;
						a[1] += 1;
						System.out.println((a[2] - a[0] + a[2] - a[1]) / 2 + 1);
				}
		}
}
