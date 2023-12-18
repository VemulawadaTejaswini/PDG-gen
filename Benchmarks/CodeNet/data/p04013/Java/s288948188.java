import java.util.Scanner;

public class Main {
	
	public static long recursAvg(int[] ar, int start, int sum) {
		if(ar.length==start){
			if(sum==0){
				return 1;
			}
			return 0;
		}
		return recursAvg(ar, start+1, sum+ar[start]) + recursAvg(ar, start+1, sum);
		//return 0;
	}


	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] info = scanner.nextLine().split(" ");
		int avg = Integer.parseInt(info[1]);
		String[] str = scanner.nextLine().split(" ");
		int[] stuff = new int[str.length];
		for(int x = 0; x<stuff.length; x++){
			stuff[x] = Integer.parseInt(str[x]) - avg;
		}
		

		System.out.println(recursAvg(stuff, 0, 0)-1);
		
	}

}