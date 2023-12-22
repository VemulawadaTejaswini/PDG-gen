import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0033().doIt();
	}
	class aoj0033{
		int a[] = new int [10];
		int num = -1;
		void doIt(){
			int n = sc.nextInt();
			for(int i = 0;i < n;i++){
				for(int j = 0;j < 10;j++){
					a[j] = sc.nextInt();
				}
				num = -1;
				if(dfs(0,0))System.out.println("YES");
				else System.out.println("NO");
			}
		}
		boolean dfs(int left,int right){
			num++;
			if(num == 10) return true;
			if(left < a[num])dfs(a[num],right);
			else if(right < a[num])dfs(left,a[num]);
			if(num == 10) return true;
			return false;
		}
	}
}