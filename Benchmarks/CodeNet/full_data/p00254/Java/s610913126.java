import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String n = scan.nextLine();
			if(n.equals("0000")){
				break;
			}
			if(n.charAt(0) == n.charAt(1)
					&& n.charAt(0) == n.charAt(2)
					&& n.charAt(0) == n.charAt(3)){
				System.out.println("NA");
				continue;
			}
			int count = 0;
			char[] num;
			int t = 0;
			while(!n.equals("6174")){
				num = n.toCharArray();
				Arrays.sort(num);
				t = Integer.parseInt(""+num[3]+num[2]+num[1]+num[0]) 
						- Integer.parseInt(""+num[0]+num[1]+num[2]+num[3]);
				if(t < 10){
					n = "000" + String.valueOf(t);
				}else if(t < 100){
					n = "00" + String.valueOf(t);
				}else if(t < 1000){
					n = "0" + String.valueOf(t);
				}else{
					n = String.valueOf(t);
				}
				count++;
			}
			System.out.println(count);
		}
	}
}