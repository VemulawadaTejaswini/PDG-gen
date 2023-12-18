import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner sc = new Scanner(System.in);
 
		int size = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if (size % 2 == 0) {
			for (int i = 0; i < size; i++) {
				if(i == 0){
					sb.append(sc.nextInt());
				}else if(i % 2 == 0){
					sb.append(" ").append(sc.nextInt());
				}else{
					sb.insert(0, sc.nextInt() + " ");
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if(i == 0){
					sb.append(sc.nextInt());
				}else if(i % 2 == 0){
					sb.insert(0, sc.nextInt() + " ");
				}else{
					sb.append(" ").append(sc.nextInt());
				}
			}
		}
 
		System.out.println(sb.toString());
		sc.close();
	}
 
}