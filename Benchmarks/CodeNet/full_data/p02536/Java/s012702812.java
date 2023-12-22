import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Integer[] listA=new Integer[M];
		Integer[] listB=new Integer[M];
		List<List<Integer>> pool=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<M;i++){
			listA[i]=sc.nextInt();
			listB[i]=sc.nextInt();
			set.add(listA[i]);
			set.add(listB[i]);
			if(pool.size()==0){
				List<Integer> hogehoge=new ArrayList<>();
					hogehoge.add(listA[i]);
					hogehoge.add(listB[i]);
					pool.add(hogehoge);
			}else{
				for(int j=0;j<pool.size();j++){
					if(pool.get(j).contains(listA[i])){
						pool.get(j).add(listB[i]);
						break;
					}
					else if(pool.get(j).contains(listB[i])){
						pool.get(j).add(listA[i]);
						break;
					}else{
						List<Integer> hogehoge=new ArrayList<>();
						hogehoge.add(listA[i]);
						hogehoge.add(listB[i]);
						pool.add(hogehoge);
					}
				}
			}
			
		}
		System.out.println(pool.size()+N-set.size()-1);
		
		
    }
	
}