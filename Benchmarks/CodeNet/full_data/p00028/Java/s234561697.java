import java.awt.List;
import java.util.*;
public class Main {
	static int ans[];
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array1=new ArrayList<Integer>();
		ArrayList<Integer>ans1=new ArrayList<Integer>();
		while(sc.hasNextInt()){array1.add(sc.nextInt());}
		Integer []arrays=(Integer[])array1.toArray(new Integer[0]);
		int cnt[]=new int[arrays.length];
		for(int i=0;i<arrays.length;i++){cnt[arrays[i]]+=1;}
		for(int i=0;i<cnt.length;i++){
			if(count<cnt[i]){count=cnt[i];}
		}
		for(int i=0;i<cnt.length;i++){if(cnt[i]==count)ans1.add(i);}
		Integer []ans2=(Integer[])ans1.toArray(new Integer[0]);
		for(int j=0;j<ans2.length;j++){
			System.out.println(ans2[j]);
			
		}
	}

}