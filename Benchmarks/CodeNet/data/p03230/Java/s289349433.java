import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n*2) % (n-1) != 0) {
			System.out.println("No");
		}else {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i = 1;i <= 2;i++) {
				if(i == 1) {
					//a.add(i);
					for(int k = 0;k < 2;k ++) {
						//System.out.println("1");
						System.out.print(n-1+" ");
						System.out.print(i+" ");
						for(int j = 1; j <= n-2;j++) {
							//a.add(k+j); 
							System.out.print(k+j+" ");
						}
						System.out.println();
					}
				}else {
					//System.out.println("2");
					System.out.print(n-1+" ");
					//System.out.print(i+" ");
					for(int j = 2; j <= n;j++) {
						System.out.print(j+" "); 
					}
					System.out.println();
				}
			}
		}
	}
}