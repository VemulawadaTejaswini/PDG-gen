import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[30];
		while(scan.hasNext()){
			a[scan.nextInt()-1]++;
		}
		for(int i = 0;i < 30;i++){
			if(a[i] == 0){
				System.out.println(i+1);
			}
		}
	}
}