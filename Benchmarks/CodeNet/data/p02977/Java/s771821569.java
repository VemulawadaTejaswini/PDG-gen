import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = num;
		while(tmp % 2 == 0) {
			tmp /= 2;
		}
		if(tmp == 1) { System.out.println("No"); return; }
		System.out.println("Yes");
		int line = (int)(Math.floor((num + 1) / 4.0) * 4) - 1;
		StringBuilder ans = new StringBuilder();
		for(int i = 1; i < line; i ++) {
			ans.append(i+" "+(i + 1)+"\n");
			ans.append((num + i)+" "+(num + i + 1)+"\n");
		}
		ans.append(line+" "+(num + 1)+"\n");
		int rest = num - line;
		switch(rest) {
		case 0: break;
		case 1:
			ans.append((num / tmp + 1)+" "+(line + 1)+"\n");
			ans.append((num - num / tmp)+" "+(num + line + 1)+"\n");
			break;
		case 2: case 3:
			ans.append((1)+" "+(line + 1)+"\n");
			ans.append((line + 1)+" "+(line + 2)+"\n");
			ans.append((num + 1)+" "+(num + line + 2)+"\n");
			ans.append((num + line + 2)+" "+(num + line + 1)+"\n");
			if(rest == 3) {
				ans.append((line + 2)+" "+(line + 3)+"\n");
				ans.append((num + 2)+" "+(num + line + 3)+"\n");
			}
			break;
		}
		System.out.println(ans);
	}
}