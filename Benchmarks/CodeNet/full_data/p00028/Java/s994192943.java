import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] hist = new int[100];
		while(scan.hasNext()){
			hist[scan.nextInt()-1]++;
		}
		int max = 0;
		for(int i = 0;i < 100;i++){
			if(max < hist[i]){
				max = hist[i];
			}
		}
		for(int i = 0;i < 100;i++){
			if(max == hist[i]){
				System.out.println(i+1);
			}
		}
	}
}