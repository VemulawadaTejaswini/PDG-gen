import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0195().doIt();
	}
	class aoj0195 {	
		String ctr[] = {"A","B","C","D","E"};
		String str(int a[],int b[]){
			int max = 0;
			String word = "";
			for(int i = 0;i < 5;i++){
				if(max < a[i] + b[i]){
					max = a[i] + b[i];
					word = ctr[i]+" "+max;
				}
			}
			return word;
		}
		void doIt() {
			while(true){
				int a[] = new int [5];
				int b[] = new int [5];
				int c[] = new int [5]; 
				a[0] = sc.nextInt();
				b[0] = sc.nextInt();
				if(a[0] + b[0] == 0)break;
				for(int i = 1;i < 5;i++){
					a[i] = sc.nextInt();
					b[i] = sc.nextInt();
				}
				System.out.println(str(a,b));
			}
		}
	}
}