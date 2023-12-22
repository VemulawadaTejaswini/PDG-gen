import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String tmp = sc.nextLine();
			if(tmp.equals("-")) break;
			int m = sc.nextInt();
			int[] h = new int[m];
			for(int i = 0; i < h.length; i++){
				h[i] = sc.nextInt();
				String temp = tmp.substring(h[i], tmp.length());
				tmp = temp + tmp.substring(0,h[i]);
			}
			System.out.println(tmp);
		}
	}

}