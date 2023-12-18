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
			for(int i=0;i<N;i++){
				if(i != index-1){
					int value = pointList.get(i);
					pointList.set(i, value-1);
				}				
			}
		}

		for(int i=0;i<N;i++){
			if(pointList.get(i) > 0){
				System.out.println("Yes");			
			}else{
				System.out.println("No");	
			}
		}
	}
}