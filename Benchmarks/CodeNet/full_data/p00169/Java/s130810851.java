import java.util.Scanner;

public class Main {
	int n[];
	
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			String str[]=sc.nextLine().split(" ");
			if(str[0].equals("0")) break;
			n=new int[str.length];
			for(int i=0;i<n.length;i++){
				n[i]=Integer.parseInt(str[i]);
			}
			System.out.println(bj(0,0));
		}
	}
	int bj(int k,int sum){
		if(k==n.length){
			if(sum<22){
				return sum;
			}
			else{
				return 0;
			}
		}
		if(n[k]==1){
			return Math.max(bj(k+1,sum+1),bj(k+1,sum+11));
		}
		else if(10<n[k]){
			return bj(k+1,sum+10);
		}
		else{
			return bj(k+1,sum+n[k]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
		//new AOJ0169().run();
	}

}