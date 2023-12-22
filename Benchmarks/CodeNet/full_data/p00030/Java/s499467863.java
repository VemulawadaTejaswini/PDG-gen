import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int sum = sc.nextInt();
			if(n == 0 && sum == 0){break;}
			
			List<Set<Integer>> check = new LinkedList<Set<Integer>>();
			
			System.out.println(cal(n,sum,0,new HashSet<Integer>(),check));
		}
	}
	
	public static int cal(int n,int sum,int cur,Set<Integer> used,List<Set<Integer>> check){
		int ret = 0;
		
		if(n == 0){return  0;}
		if(sum < cur){return 0;}
		
		for(int i = 0;i < 10;i++){
			if(!used.contains(i)){
				if(n == 1){
					if(cur + i == sum){
						used.add(i);
						if(!check.contains(used)){
							Set<Integer> temp = new HashSet<Integer>();
							temp.addAll(used);
							check.add(temp);
							used.remove(i);
							return 1;
						}
						used.remove(i);
					}
				}else{
					used.add(i);
					ret += cal(n-1,sum,cur+i,used,check);
					used.remove(i);
				}
			}	
		}
		
		return ret;
	}
	
}