import java.util.ArrayList;
import java.util.Scanner;


protected class UFT_Node {
int name;
UFT_Node next;
int rank;

public UFT_Node(int new_name){
	this.name = new_name;
	this.rank =0;
	this.next = this;
	}

public UFT_Node getRep(){
	UFT_Node output;
	if (this.next.name == this.name)
		return this;
	else output = this.next.getRep();
	this.next = output; 
	return output;
}

}

public class Main {
	UFT_Node[] nodes;
	public static void main(String[] args){
		ArrayList<Integer> output = new ArrayList<Integer>();
		Main test = new Main();
		Scanner inputScanner = new Scanner("System.in");
		int n = inputScanner.nextInt();
		int q = inputScanner.nextInt();
		test.nodes = test.makeArray(n);
		
		int type = -1;
		int x= -1;
		int y= -1;
		for (int i=0;i<q;i++){
			type = inputScanner.nextInt();
			x = inputScanner.nextInt();
			y = inputScanner.nextInt();
			if(type ==0){
				test.union(x,y);
			}
			if(type ==1){
				if(test.same(x, y))
					output.add(1);
				else
					output.add(0);
			}
		} 
		for(Integer out : output){
			System.out.println(out.toString());
		}
	}
	public UFT_Node[] makeArray(int num){
		UFT_Node[] output = new UFT_Node[num];
		for (int i=0; i<num;i++){
			output[i] = new UFT_Node(i);
		}
	return output;
	}
	
	public void union(int x, int y){
		UFT_Node yRep = nodes[y].getRep();
		UFT_Node xRep = nodes[x].getRep();
		if (yRep.rank> xRep.rank){
			xRep.next= yRep;
		}
		else if(yRep.rank< xRep.rank){
			yRep.next= xRep;
		}
		else{
			yRep.next= xRep;
			xRep.rank++;
		}
	}
	
	public boolean same (int x, int y){
		return nodes[x].getRep().name==nodes[y].getRep().name;
	}
}


