import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> ans=new ArrayList();
		int counter=0;
		int a,b;
		do {
			a=in.nextInt();
			b=in.nextInt();
			if(a==0 && b==0){
				break;
			}
			for (int i=1;i<=b;i++) {
				for (int j=i+1;j<=b-i;j++) {
					for (int k=j+1;k<=b-i-j;k++) {
						if((i+j+k)==b){
							counter++;
						}
					}
				}
			}
			ans.add(counter);
		} while (in.hasNext());
		for (int i=0;i<ans.size();i++) {
				System.out.printf("%d%n",ans.get(i));
		}
	}
}