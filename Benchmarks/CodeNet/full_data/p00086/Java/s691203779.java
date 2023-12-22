import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int MAX = 10000;
			int num[] = new int[MAX];
			while(true){
				int a = cin.nextInt() - 1;
				int b = cin.nextInt() - 1;
				if(a==-1) break;
				num[a]++; num[b]++;
			}
			boolean flag = true;
			if(num[0]%2==0) flag = false;
			if(num[1]%2==0) flag = false;
			for(int i=2;i<MAX;i++){
				if(num[i]%2!=0) flag = false;
			}
			if(flag) System.out.println("OK");
			else System.out.println("NG");
		}
	}
}