import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{


	public static void main(String[] args)throws NumberFormatException, IOException{
		InputStreamReader input = new InputStreamReader (System. in);
		BufferedReader buffer = new BufferedReader(input);
		String scan = buffer.readLine();
		long processStart = System.currentTimeMillis();
		Deque<Integer> stack = new ArrayDeque<Integer>();

		int nodeAmount  = Integer.parseInt(scan);
		int[] nodeID    = new int[nodeAmount];
		int[] nodeL     = new int[nodeAmount];
		int[] nodeR     = new int[nodeAmount];
		int[] nodeLeft  = new int[nodeAmount];
		int[] nodeRight = new int[nodeAmount];
		int[] parent    = new int[nodeAmount];
		nodeClass ueoka = new nodeClass();
		
		
		for(int i=0; i<nodeAmount; i++){
			scan = buffer.readLine();
			String[] str = scan.split(" ");
			nodeID[i] = Integer.parseInt(str[0]);
			nodeL[i] = Integer.parseInt(str[1]);
			nodeLeft[nodeID[i]]  = nodeL[i];
			nodeR[i] = Integer.parseInt(str[2]);
			nodeRight[nodeID[i]] = nodeR[i];
			parent[i] = -1;
		}
		
		for(int i=0; i<nodeAmount; i++){		//parent??????????????????
			
			if(nodeLeft[i] > -1){
				parent[nodeLeft[i]]   = i;
				
			}
			if(nodeRight[i] > -1){
				parent[nodeRight[i]]  = i;
				
			}

		}
		
		int isRoot = 0;
		for(int i=0; i<nodeAmount; i++){		//parent????????±??????sibling??????????????????????????§???parent == -1??§??????Root????????????????????????
			if(parent[i] == -1){
				isRoot = i;
			}
		}
		
		stack.add(isRoot);
		int[] nodeLeftCopy = nodeLeft.clone();
		
		System.out.println("Preorder");
		nodeClass.Preorder(isRoot,nodeLeft,nodeRight);
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		stack.add(isRoot);
//		while(!stack.isEmpty()){		//root???????????????depth??????????????????
//			
//			int check = stack.pollLast();
//			if(nodeLeft[check] > -1){
//				depth[nodeLeft[check]] = depth[check]+1;
//				stack.add(nodeLeft[check]);
//			}
//			if(nodeRight[check] > -1){
//				depth[nodeRight[check]] = depth[check]+1;
//				stack.add(nodeRight[check]);
//			}
//		}
//
//
//		stack.clear();
//		for(int i=0; i<nodeAmount; i++){		//depth????????±??????height????±??????????
//			if(degree[i] == 0){
//				height[i] = 0;
//			}
//			else{
//				int maxDepth = 0;
//				
//				if(nodeLeft[i] != -1){
//					stack.add(nodeLeft[i]);
//				}
//				if(nodeRight[i] != -1){
//					stack.add(nodeRight[i]);
//				}
//				while(!stack.isEmpty()){
//					
//					int check = stack.pollLast();
//					if(nodeLeft[check] != -1){
//						stack.add(nodeLeft[check]);
//					}
//					if(nodeRight[check] != -1){
//						stack.add(nodeRight[check]);
//					}
//					if(depth[check] > maxDepth){
//						maxDepth = depth[check];
//					}
//				}
//				height[i] = maxDepth - depth[i];
//			}
//		}
//
//		for(int i=0; i<nodeAmount; i++){
//			if (depth[i] == 0){
//				rank[i] = "root";
//			}
//			else if(height[i] == 0){
//				rank[i] = "leaf";
//			}
//			else{
//				rank[i] = "internal node";
//			}
//		}
//		
//		for(int i=0; i<nodeAmount; i++){
//			System.out.println("node "+i+": parent = "+parent[i]+", sibling = "+sibling[i]+", degree = "+degree[i]+", depth = "+depth[i]+", height = "+height[i]+", "+rank[i]);
//		}
//
//		long processEnd = System.currentTimeMillis();
////		System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}
}


class nodeClass{
	static Deque<Integer> stackPre = new ArrayDeque<Integer>();
	public nodeClass(){
		
	}
	
	public static void Preorder(int first,int[] left,int[] right){
		if(first != -100){
			stackPre.addFirst(first);
		}
		int ID = stackPre.peek();

		
		
		if(left[ID] != -1){
			System.out.print(" "+ID);
			stackPre.addFirst(left[ID]);
			left[ID] = -1;
			Preorder(-100,left,right);
		}
		if(right[ID] != -1){
			System.out.print(" "+ID);
			stackPre.addFirst(right[ID]);
			right[ID] = -1;
			Preorder(-100,left,right);
		}
		else if(right[ID] == -1 && left[ID] == -1){
			System.out.print(" "+ID);
			try{
				stackPre.removeFirst();
			}
			catch(java.util.NoSuchElementException e){
				
			}
			finally{
				if (!stackPre.isEmpty()){
					Preorder(-100,left,right);
				}
			}
		}
	}



	
}