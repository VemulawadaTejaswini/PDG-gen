import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int b = sc.nextInt();
			if(b == 0){
				//System.out.println("break");
				break;
			}
			int[] a = new int[b];
			int left,right,searchvalue;
			for(int i=0; i < a.length; i++){
				a[i] = sc.nextInt();
			}
			searchvalue = sc.nextInt();
			left = 0; right = a.length-1;
			System.out.println(solve(left, right, searchvalue, a));
		}
	}

	int solve(int left, int right,int sv,int[] a){
		int index = (left + right) / 2;
		int cnt;
		//System.out.println("left:"+left+" right:"+right+" sv:"+sv+" a[index]:"+a[index]);
		if(a[index] == sv){
			return 1;
		}else if(left > right){
			return 0;
		}else if(a[index] < sv){
			left = index;
			return 1 + solve(++left, right, sv, a);
		}else if(a[index] > sv){
			right = index;
			return 1 + solve(left, --right, sv, a);			
		}
		return 0;
		
		/*
		if(cnt == a.length-1){
			System.out.println(cnt);
			return;
		}
		if(a[(left + right) / 2] < sv){
			System.out.println("left:"+left+" right:"+right);
			if(left <= right){
				left = (left + right) / 2 + 1;
				solve(left, right,sv, a, ++cnt);
			}else{
				System.out.println(++cnt);
			}
		}else if(a[(left + right) / 2] > sv){
			System.out.println("left:"+left+" right:"+right);
			if(left < right){
				right = (left + right) / 2 - 1;
				solve(left, right,sv, a, ++cnt);
			}else{
				System.out.println(++cnt);
			}
		}else{
			System.out.println(++cnt);
		}
		*/
	}
}