
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	int w;
	int count;
	Point(int a,int b,int c,int d,int e){
		this.x = a;
		this.y = b;
		this.z = c;
		this.w = d;
		this.count = e;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int[] L = new int[N];

		for(int i = 0 ; i < N ; i++){
			L[i] = sc.nextInt();
		}
		sc.close();

		int[] dx = {1,0,0};
		int[] dy = {0,1,0};
		int[] dz = {0,0,1};
		int[] dw = {0,0,0};

		Deque<Point> stack = new ArrayDeque<Point>();
		stack.push(new Point(0,0,0,0,0));

		int ans = 100000000;
		int tmp = 0;
		while(!stack.isEmpty()){
			Point p = stack.poll();

			int nx = p.x;
			int ny = p.y;
			int nz = p.z;
			int nw = p.w;
				for(int i = 0 ; i < 3 ; i++){
					int x = nx + (dx[i] * L[p.count]);
					int y = ny + (dy[i] * L[p.count]);
					int z = nz + (dz[i] * L[p.count]);
					int w = nw + 10;
					int count = p.count + 1;
					if(count < N){
						stack.push(new Point(nx,ny,nz,nw,count));
						stack.push(new Point(x,y,z,w,count));
					}

					if(x!=0 && y!=0 && z !=0){
						tmp = Math.abs(A-x) + Math.abs(B-y) + Math.abs(C-z) + w - 30;
//						System.out.println(x + " " + y + " " + z + " " + w + " " + tmp);
						if(ans > tmp){
							ans = tmp;
						}
					}
				}
		}

		System.out.println(ans);

	}
}
