import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int b = sc.nextInt();
			if(b == 0){
				break;
			}
			int[] a = new int[b];
			int left,right,searchvalue;
			for(int i=0; i < a.length; i++){
				a[i] = sc.nextInt();
			}
			searchvalue = sc.nextInt();
			left = 0; right = a.length-1;
			solve(left, right, searchvalue, a, 0);
		}
	}

	void solve(int left, int right,int sv,int[] a, int cnt){
		System.out.println("left:"+left+" right:"+right+" sv:"+sv+" cnt:"+cnt);
		System.out.println("a[] is "+a[(left + right)/2]);
		if(a[(left + right) / 2] < sv){
			//if((left + right) % 2 == 1) left++;
			if(left != right){
				left = (left + right) / 2 + 1;
				System.out.println("left is " + left + " a[] is " +a[left]);
				solve(left, right,sv, a, ++cnt);
			}
		}else if(a[(left + right) / 2] > sv){
			//if((left + right) % 2 == 1) right++;
			if(left != right){
				right = (left + right) / 2 - 1;
				System.out.println("right is " + right +" a[] is "+ a[right]);
				solve(left, right,sv, a, ++cnt);
			}else{
				System.out.println(++cnt);
			}
		}else{
			System.out.println(++cnt);
		}
	}
}