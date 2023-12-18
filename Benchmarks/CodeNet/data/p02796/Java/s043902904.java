import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Robot[] r = new Robot[n];
		int max = 0;

		for(int i = 0;i < n;i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			r[i] = new Robot(x,l);
		}
		r = Robot.shuffle(n,r);
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(r[i].x + r[i].l < r[j].x) {
					break;
				}else if(r[i].x + r[i].l >= r[j].x - r[j].l){
					max++;
				}else {

				}
			}
		}
		System.out.println(n-max);

	}


}

class Robot{
	int x;
	int l;
	Robot(int x,int l){
		this.x = x;
		this.l = l;
	}

	public static Robot[] shuffle(int n,Robot[] rr) {
		Robot[] r = rr;
		Robot tmp2;
		for(int i = 0;i < n;i++) {
			for(int j = i+1;j < n;j++) {
				if(r[i].x > r[j].x) {
					tmp2 = r[i];
					r[i] = r[j];
					r[j] = tmp2;
				}
			}
		}
		return r;
	}
}