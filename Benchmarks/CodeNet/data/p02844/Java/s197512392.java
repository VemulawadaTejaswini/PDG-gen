import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		char[] str = sc.next().toCharArray();
		sc.close();
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<10;i++) array.add(new ArrayList<Integer>());
		for(int i=0;i<n;i++) array.get((int)str[i]-48).add(i);
		for(int i=0;i<=9;i++) {
			if(array.get(i).size()==0) continue;
			int left=array.get(i).get(0);
			for(int j=0;j<=9;j++) {
				ArrayList<Integer> temp = array.get(j);
				int size=temp.size(),center=0;
				for(int m=0;m<size;m++) {
					center=temp.get(m);
					if(center>left) break;
				}
				if(center==0 || center<=left) continue;
				for(int k=0;k<=9;k++) {
					ArrayList<Integer> temp2 = array.get(k);
					int size2 = temp2.size(),right=0;
					for(int m=0;m<size2;m++) {
						right=temp2.get(m);
						if(right>center) break;
					}
					if(right==0 || right<=center) continue;
					count++;
					//System.out.printf("%d%d%d\n",i,j,k);
				}
			}
		}
		System.out.println(count);
	}
}