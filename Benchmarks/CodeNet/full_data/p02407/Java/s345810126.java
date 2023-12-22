import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");
		String[] num = new String[input.length];
		for(int i=0;i<input.length;i++){
			num[i]=input[input.length-i-1];
		}
		for(int i=0;i<input.length-1;i++){
			System.out.print(num[i]+" ");
		}
		System.out.print(num[input.length-1]);
	}
}