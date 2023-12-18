import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String nums = sc.nextLine();
		String[] num = nums.split(" ");
		boolean flag = true;
		for(int i=0;i<Integer.parseInt(n)-1;i++) {
			for(int j=i+1;j<Integer.parseInt(n);j++) {
				int a = i;
				int b = j;
				if(num[a].equals(num[b])){
					flag = false;
					System.out.println("NO");
					break;
				}
			}
		}
		if(flag==true) {
			System.out.println("YES");
		}
	}
}