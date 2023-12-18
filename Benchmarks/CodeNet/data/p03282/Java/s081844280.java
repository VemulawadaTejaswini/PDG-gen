import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Long>nArrayList=new ArrayList<>();
		String N=sc.next();
		String[] n=N.split("");
		Long[] nArray=new Long[n.length];
		long K=sc.nextLong();
		
		for(int i=0;i<n.length;i++) {
			nArray[i]=Long.parseLong(n[i]);
			nArrayList.add(nArray[i]);
		}
		
		for(int i=0;i<K;i++) {
			if(nArrayList.get(i)!=1) {
				System.out.println(nArrayList.get(i));
				break;
			}else if(i==K-1) {
				System.out.println(1);
			}	
		}		
	}

}
