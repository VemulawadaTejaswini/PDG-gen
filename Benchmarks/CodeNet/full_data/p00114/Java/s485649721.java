import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] a = new int[3];
			int[] m = new int[3];
			for(int i=0;i<3;i++){
				a[i] = sc.nextInt();
				m[i] = sc.nextInt();
			}
			if(a[0]==0 && a[1]==0 && a[2]==0 && m[0]==0 && m[1]==0 && m[2]==0)break;

			int x = 1;
			int y = 1;
			int z = 1;
			int count = 0;
			while(true){
				x = (a[0]*x)%m[0];
				y = (a[1]*y)%m[1];
				z = (a[2]*z)%m[2];
				count++;
				if(x==1 && y==1 && z==1)break;
			}
			System.out.println(count);
		}
	}	
}