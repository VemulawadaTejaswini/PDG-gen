import java.util.Scanner;
class Main {
	int n,x,i,max,min,kei;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		max = x;
		min = x;
		kei = kei + x;
		for(i = 1;i < n;i++){
			x = sc.nextInt();
			if(max < x){
				max = x;
			}else if(min > x){
				min = x;
			}
			kei = kei + x;
		}
		System.out.println(min + " " + max + " " + kei);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}