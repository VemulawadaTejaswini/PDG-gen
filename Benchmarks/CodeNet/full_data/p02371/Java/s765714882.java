
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author prashant
 *
 */
public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int n = scanner.nextInt();
			Node[] nodes = new Node[n];
			for(int i = 0; i<n; i++){
				nodes[i] = new Node();				
			}
			for(int i=1;i<n;i++){
				nodes[scanner.nextInt()].addNode(nodes[scanner.nextInt()], scanner.nextInt());
			}
			System.out.println(nodes[0].getDiameter());
		}catch(Exception e){
			System.out.println(-1);
		}
	}
	
	
	static class Node {
		
		private List<Node> nodes = new ArrayList<>();
		private List<Long> weigths = new ArrayList<>();
		private boolean hasParent = false;
		
		private long weightedHeight = - 1;
		
		public void addNode(Node node, long weight){
			if(!node.hasParent){
				nodes.add(node);
				weigths.add(weight);
				node.hasParent = true;
			}else{
				node.addNode(this, weight);
			}
		}
		
		public long getWeightedHeight(){
			if(weightedHeight != -1) return weightedHeight;
			long wheight = 0;
			for (int i=0;i<nodes.size();i++){
				wheight = Math.max(wheight,weigths.get(i) + nodes.get(i).getWeightedHeight());
			}
			weightedHeight = wheight;
			return wheight;
		}
		
		public long getDiameter(){
			long diameter = 0;
			long h1 = 0, h2 = 0;
			Integer i1 = null, i2 = null;
			for (int i=0;i<nodes.size();i++){
				diameter = Math.max(diameter, nodes.get(i).getDiameter());
				long height = nodes.get(i).getWeightedHeight() + weigths.get(i);
				if(height > h2 && height < h1){
					h2 = height;
					i2 = i;
				}
				if(height >= h1){
					h2 = h1;
					h1 = height;
					i2 = i1;
					i1 = i;
				}
			}
			if(i1 != null && i2 != null){
				diameter = Math.max(diameter, h1 + h2);				
			}else if (i1 != null){
				diameter = Math.max(diameter, h1);					
			}else if (i2 != null){
				diameter = Math.max(diameter, h2);				
			}
			return diameter;
		}
	}
}
