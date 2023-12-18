import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		StringBuffer sb = new StringBuffer(S);
		int Q = sc.nextInt();
		int reverceCount = 0;
		
		for(int i = 0; i < Q; i++) {
			int query = sc.nextInt();
			if(query == 1) {
				reverceCount++;
				//sb = sb.reverse();
				
			}else if(query == 2) {
				//反転している状態なら指示と逆に付与
				if(reverceCount % 2 == 1) {
					int F = sc.nextInt();
					if(F == 1) {
						sb.append(sc.next());
					}else if(F == 2) {
						sb.insert(0, sc.next());
					}
					
				}else {
					//反転していない状態
					int F = sc.nextInt();
					if(F == 1) {
						sb.insert(0, sc.next());
					}else if(F == 2) {
						sb.append(sc.next());
					}
				}
			}
		}

		//最後に反転する必要があるなら反転
		if(reverceCount % 2 == 1) {
			//sb.reverse();
			for (int i = sb.length() - 1; i >= 0; i--) {
				System.out.print(sb.charAt(i));
			}
		}else {
			System.out.println(sb);
		}
		
		sc.close();
	}
	
}