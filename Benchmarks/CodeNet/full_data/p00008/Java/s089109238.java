import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			if(37 <= n && n <= 50){
				System.out.println(count);
				System.exit(0);
			}
			for(int a=0;a<=9;a++){
				for(int b=0;b<=9;b++){
					for(int c=0;c<=9;c++){
						for(int d=0;d<=9;d++){
							if(a+b+c+d==n)
								count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}