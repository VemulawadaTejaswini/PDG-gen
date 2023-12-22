import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		for(;;){
			String wo = sc.next();
			if(wo.equals("-"))break;
			String[] woArray = wo.split("");
			String[] ans = new String[woArray.length];
			String[] sans = new String[woArray.length];
			int m = sc.nextInt();
			for(int i=0; i<m; i++){
				int h = sc.nextInt();
				for(int j=0; j<woArray.length; j++){
					int add = j + h;
					if(add>=woArray.length){
						num = add - woArray.length;
					}else{
						num = add;
					}
					ans[j]=woArray[num];
				}
				for(int j=0; j<woArray.length; j++){
					woArray[j]=ans[j];
				}
			}
			for(int j=0; j<ans.length; j++){
				System.out.print(ans[j]);
			}
			System.out.println();
		}
	}
}