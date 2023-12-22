import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int sktr(int n,int a[]){
		int result = 0;
		int max = 0;
		for(int i = 0;i < n;i++){
			if(a[i] + result >= 0){
				result = result + a[i];
				if(max < result)max = result;
			}else{
				result = 0;
			}
		}
		if(max == 0){
			max = a[0];
			for(int i = 1;i < n;i++){
				if(max < a[i])max = a[i];
			}
		}
		return max;
	}
	void doIt() {
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int a[] = new int [n];
			for(int i = 0;i < n;i++){
				a[i] = sc.nextInt();
			}
			System.out.println(sktr(n,a));
		}
	}
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}