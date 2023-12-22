import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> ans= new ArrayList<Integer>();
		int counter=0;
		int a,b;
		while (in.hasNext()){
			a=in.nextInt();
			b=in.nextInt();
			if(a==0 && b==0){
				break;
			}
			for (int i=1;i<=a;i++) {
				for (int j=i+1;j<=a;j++) {
					for (int k=j+1;k<=a;k++) {
						if((i+j+k)==b){
							counter++;
						}
					}
				}
			}
			ans.add(counter);
			counter=0;
		}
		for (int i=0;i<ans.size();i++) {
				System.out.printf("%d%n",ans.get(i));
		}
	}
}