import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if(s.equals("0"))System.exit(0);
			int sum=0;
		    for(char c : s.toCharArray()){
		    	sum+=Integer.parseInt(String.valueOf(c));
			}
			System.out.println(sum);
		}
	}
}
