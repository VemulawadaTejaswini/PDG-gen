import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int ans;
		while(scan.hasNext()){
			app.input(num,scan);
			ans = app.operation(num);
			System.out.println(ans);
		}
	}
	
	public int operation(int[] num){
		int i,j;
		int[] tmp = new int[10];
		for(i=0;i<10;i++){
			tmp[i] = num[i];
		}
		
		for(i=9;i>=1;i--){
			for(j=0;j<i;j++){
				num[j] = tmp[j]+tmp[j+1];
				if(num[j]>=10){
					num[j]-=10;
				}
			}
			for(j=0;j<i;j++){
				tmp[j] = num[j];
			}
		}
		
		return num[0];
	}
	
	public void input(int[] num,Scanner scan){
		String str = scan.nextLine();
		for(int i=0;i<str.length();i++){
			num[i] = Integer.parseInt(""+str.charAt(i));
		}
	}
}