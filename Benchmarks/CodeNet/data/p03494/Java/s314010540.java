import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //��
		int data[] = new int[N]; //�l�ۑ��p
		int cnt=0; //������s������
		
		for(int i=0;i<N;i++) {
			data[i] = sc.nextInt();
		}
		while(checkNum(data)) {
			cnt++;
			for(int i=0;i<data.length;i++) {
				data[i] = data[i]/2;
			}
		}
		System.out.println(cnt);
	}
	static boolean checkNum(int n[]) {
		for(int i=0;i<n.length;i++) {
			if(n[i]%2 != 0)return false;
		}
		return true;
	} 
}
