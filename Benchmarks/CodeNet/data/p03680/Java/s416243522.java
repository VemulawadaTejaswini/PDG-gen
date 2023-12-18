import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int [n];
		int sum = 1;
		int tekitou;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		tekitou = a[0];
		while(true){
			if(sum>n){
				System.out.println("-1");
				break;
			}else{
				tekitou = a[tekitou-1];
				sum+=1;
			}
			if(tekitou==2){
				System.out.println(sum);
			}
		}
	}
}