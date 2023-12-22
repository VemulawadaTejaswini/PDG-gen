import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		int[] m = new int[3];
		while(scan.hasNext()){
			a[0] = scan.nextInt();
			m[0] = scan.nextInt();
			a[1] = scan.nextInt();
			m[1] = scan.nextInt();
			a[2] = scan.nextInt();
			m[2] = scan.nextInt();
			if(a[0] == 0 && a[1] == 0 && a[2] == 0 
					&& m[0] == 0 && m[1] == 0 && m[2] == 0){
				break;
			}
			int x = 1;
			int count = 0;
			while(true){
				x = (x * a[0]) % m[0];
				count++;
				if(x == 1){
					if(eFly(a[1],m[1],count)){
						if(eFly(a[2],m[2],count)){
							System.out.println(count);
							break;
						}
					}
				}
			}
		}
	}
	
	public static boolean eFly(int a,int m,int count){
		int x = 1;
		for(int i = 0;i < count;i++){
			x *= a;
			if(m < x){
				x %= m;
			}
		}
		return (x==1)?true:false;
	}
}