// C - Attack Survival

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		List<Integer> pointList = new ArrayList<>();
		for(int i=0;i<N;i++){
			pointList.add(K);
		}
		
		List<Integer> AList = new ArrayList<>();
		for(int i=0;i<Q;i++){
			sc.nextLine();
			AList.add(sc.nextInt());
		}

		for(int index : AList){
			pointList.set(index-1, pointList.get(index-1)+1);
		}

		for(int i=0;i<N;i++){
			if(pointList.get(i) - AList.size() > 0){
				System.out.println("Yes");			
			}else{
				System.out.println("No");	
			}
		}
	}
}