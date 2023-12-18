import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		
		int sum = 0;
		while(true) {
			int count = 0;
			for(int i = 0; i < str.length; i++) {
				if(i >= str.length-2) break;
				if(str[i].equals("A") && str[i+1].equals("B") && str[i+2].equals("C")) {
					str[i] = "B";
					str[i+1] = "C";
					str[i+2] = "A";
					i = i +3;
					count++;
				}
			}
			if(count==0) break;
			sum+=count;
		}
		//System.out.println(String.join("", str));
		System.out.println(sum);
	}
}