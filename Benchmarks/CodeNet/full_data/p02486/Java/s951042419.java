import java.util.Scanner;

class Main {
	int n,x;
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		
		while(true){
			app.n = scan.nextInt();
			app.x = scan.nextInt();
			if(app.n==0 && app.x==0){
				break;
			}
			System.out.println(app.exec(1,0,0));
			
		}
	}
	
	public int exec(int current,int sum,int num){
		int count = 0;
		
		if(current <= n){
			if(num == 3){
				return 0;
			}else if(num == 2){
				if(current+sum == x){
					count++;
				}else if(current+sum < x){
					count += exec(current+1,sum,num);
					count += exec(current+1,sum+current,num+1);
				}
			}else{
				if(current+sum < x){
					count += exec(current+1,sum,num);
					count += exec(current+1,sum+current,num+1);
				}
			}
		}
		
		return count;
	}
}