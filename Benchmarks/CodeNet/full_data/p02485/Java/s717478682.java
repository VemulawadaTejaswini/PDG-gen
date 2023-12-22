import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x,total,i=0;
		int[] result = new int[1000000];
		while(true){
			x = sc.nextInt();
			if(x==0) break;
			total = 0;
			while(x!=0){
				total += x-(x/10)*10;
				x /= 10;
			}
			result[i++] = total;
		}
		for(int j=0;j<i;j++){
			System.out.println(result[j]);
		}
	}

}