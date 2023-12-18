import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int a = 0;
		String b = String.valueOf(sum);
		if(sum%10 == 0){
			a = 10;
		}else{
			String[] c = b.split("",0);
			int[] d = new int[c.length];
			for(int j = 0; j < c.length; j++){
				d[j] = Integer.parseInt(c[j]);
			}
			for(int i = 0; i < d.length; i++){
				a += d[i];
			}
		}
		System.out.println(a);
	}
}