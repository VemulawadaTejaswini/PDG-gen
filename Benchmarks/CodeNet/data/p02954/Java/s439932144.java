import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int n = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (c[i] != c[i + 1]) {
				n++;
			}
		}
		int x[] = new int[n];
		Renzoku(c, x);
int y[]=new int[x.length/2];
y[0]=x[0]-1;
for(int i=1;i<y.length;i++){
	y[i]=y[i-1]+x[2*i]+x[2*i-1];
}

int mark=0;
for(int i=0;i<c.length;i++){
if(i!=y[mark]){
	System.out.print(0+" ");
}else{
	int ans=(x[mark*2]/2)+(x[mark*2]%2)+(x[mark*2+1]/2);
	int ans2=(x[mark*2]/2)+(x[mark*2+1]%2)+(x[mark*2+1]/2);
	System.out.print(ans+" ");
	System.out.print(ans2+" ");
	mark++;
	if(mark>=y.length){
		mark--;
	}
	i++;
}
}

System.out.println();
	}

	public static int Renzoku(char c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}
	static void show(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
}
