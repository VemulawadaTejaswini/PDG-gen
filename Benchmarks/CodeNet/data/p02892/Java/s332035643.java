package B;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] edgeArr = new int[n][n];
		
		for(int i = 0; i < n ; i++) {
			String[] lineArr = sc.nextLine().split("");
			for(int j = 0; j < n; j++) {
				edgeArr[i][j] = Integer.parseInt(lineArr[j]);
			}
		}
		
		sc.close();
		
		int[] labelArr = new int[n];
		for(int i = 0; i < n;i++) {
			labelArr[i] = -1;
		}
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.push(new Integer(0));
		labelArr[0] = 0;
		while(!queue.isEmpty()) {
			int nowNode = queue.pop();
			for(int i= 0; i< n;i++ ) {
				
				int edge = edgeArr[nowNode][i];
				if(edge == 0) {
					continue;
				}
				
				int labelValue = (labelArr[nowNode] + 1) % 2;
				
				if(labelArr[i] != -1 && labelArr[i] != labelValue) {
					System.out.println(-1);
					return;
				}
				
				if(labelArr[i] == -1) {
					labelArr[i] = labelValue;
					queue.push(new Integer(i));
				}
			}
		}
		
		final int INF = 1000000;
		int[][] distArr = new int[n][n];
				
		for(int i = 0; i <  n;i++) {
			for(int j = 0; j < n; j++) {
				if(edgeArr[i][j] == 0 && i != j) {
					distArr[i][j] = INF;
				}else {
					distArr[i][j] = edgeArr[i][j];
				}
			}
		}
		
		for(int k = 0; k < n;k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(distArr[i][j] > distArr[i][k] + distArr[k][j]) {
						distArr[i][j] =  distArr[i][k] + distArr[k][j];
					}
				}
			}
		}
		
		int maxDist = 0;
		for(int i = 0; i < n ;i++) {
			for(int j = 0; j < n;j++) {
				if(maxDist < distArr[i][j]) {
					maxDist = distArr[i][j];
				}
			}
		}
		
		System.out.println(maxDist+1);
		
//		ArrayList<HashSet<Integer>> retList = new ArrayList<>();
//		HashSet<Integer> beforeSet = new HashSet<>();
//		
//		beforeSet.add(new Integer(0));
//		
//		int[] hasIn = new int[n];
//		for(int i = 0; i < n;i++) {
//			hasIn[i] = -1;
//		}
//		hasIn[0] = 1;
//		
//		retList.add(new HashSet<Integer>(beforeSet));
//		
//		
//		while(!beforeSet.isEmpty()) {
//			HashSet<Integer> nowSet = new HashSet<>();
//			for(int node : beforeSet) {
//				for(int i = 0; i < n; i++) {
//					if(hasIn[i] != -1) {
//						continue;
//					}
//					if(edgeArr[node][i] == 1) {
//						nowSet.add(new Integer(i));
//						hasIn[i] = 1;
//					}
//				}
//			}
//			if(!nowSet.isEmpty()) {
//				retList.add(new HashSet<Integer>(nowSet));
//			}
//			beforeSet = nowSet;
//		}
//		
////		for(HashSet<Integer> set : retList) {
////			System.out.println(set);
////		}
////		System.out.println(" ----- ");
//		int additionalSet = 0;
//		
//		HashSet<Integer> left2Set = retList.get(1);
//		boolean hasAddLeft = false;
//		HashSet<Integer> removeLeftSet = new HashSet<>();
//		if(left2Set.size() > 1) {
//			for(int node : left2Set) {
//				boolean isDependWithout0 = true;
//				for (int i = 1; i < n;i++) {
//					if(edgeArr[node][i] == 1) {
//						isDependWithout0 = false;
//						break;
//					}
//				}
//				if(isDependWithout0 && left2Set.size() - removeLeftSet.size() > 1) {
//					removeLeftSet.add(new Integer(node));
//					hasAddLeft = true;
//				}
//			}
//		}
//		
//		for(int node: removeLeftSet) {
//			left2Set.remove(new Integer(node));
//		}
//		
//		if(hasAddLeft) {
//			additionalSet++;
//		}
//		
//		
//		if(retList.size() >= 3) {
//			HashSet<Integer> right3Set = retList.get(retList.size()-3);
//			HashSet<Integer> right2Set = retList.get(retList.size()-2);
//			HashSet<Integer> right1Set = retList.get(retList.size()-1);
//			HashSet<Integer> removeRightSet = new HashSet<>();
//			boolean hasAddRight = false;
//			if(right2Set.size() > 1) {
//				for(int node : left2Set){
//					boolean isDependWithout = true;
//					for(int i = 0; i< n; i++) {
//						if(edgeArr[node][i] == 1) {
//							if(right3Set.contains(new Integer(i))) {
//								isDependWithout = false;
//								break;
//							}
//						}
//					}
//					if(isDependWithout && right2Set.size() - removeRightSet.size() > 1) {
//						removeRightSet.add(new Integer(node));
//						hasAddRight = true;
//					}
//				}
//			}
//			
//			for(int node: removeRightSet) {
//				right2Set.remove(new Integer(node));
//			}
//			if(hasAddRight) {
//				additionalSet++;
//			}	
//		}
		
//		for(HashSet<Integer> set : retList) {
//			System.out.println(set);
//		}
//		System.out.println(removeLeftSet);
//		System.out.println(removeRightSet);
//		System.out.println(retList.size()+ additionalSet);
	}
}
