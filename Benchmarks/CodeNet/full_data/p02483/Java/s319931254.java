import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] num = {0,0,0};
		for(int i=0;i<num.length;i++){
			int n = scan.nextInt();
			for(int j=0;i<num.length;i++){
				if(num[j] < n){
					for(int k=num.length-1;j<k;k--){
						num[k] = num[k-1];
					}
					num[j] = n;
					break;
				}else{
					num[i] = n;
				}
			}
		}
		for(int number:num){
			System.out.println(number);
		}
		scan.close();
	}
}