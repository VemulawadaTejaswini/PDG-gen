import java.util.Scanner;


public class AOJ_Volume0028 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] count = new int[101];
		int max,value;
		while(sc.hasNext()){
			value = sc.nextInt();
			count[value]++;
		}
		max = count[0];
		for(int i=0;i<100;i++){
			if(max < count[i]) max = count[i];
		}
		for(int i=0;i<100;i++){
			if(max == count[i]) System.out.println(i);
		}
	}
}