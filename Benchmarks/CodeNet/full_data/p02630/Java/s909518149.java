import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String retu[] = new String[a];
		
		
		for(int i =0;i<a;i++) {
			retu[i]= sc.next();
		}
		int b =sc.nextInt();
		String syori[] = new String[b];
		String change[]= new String[b];
		
		for(int i =0; i<b;i++) {
			syori[i]= sc.next();
			change[i]=sc.next();
		}
		
		for(int j =0;j<b;j++) {
			int ans =0;
			for(int i=0;i<a;i++) {
			
				if(retu[i].equals(syori[j])) {
					retu[i]=change[j];
				
				}
			
			}
			
			for(int i =0;i<a;i++) {
				ans +=Integer.parseInt(retu[i]);
			}
			System.out.println(ans);
		}
	}

}
