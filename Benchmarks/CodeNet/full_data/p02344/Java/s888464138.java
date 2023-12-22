import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //////////// Just add a system for weighting
public class UFTW_Node {
	int name;
	UFTW_Node next;
	int rank;
	int next_diff;

	public UFTW_Node(int new_name){
		this.name = new_name;
		this.rank =0;
		this.next_diff =0;
		this.next = this;
		}

	public UFTW_Node getRep(){
		UFTW_Node output;
		if (this.next.name == this.name)
			return this;
		else output = this.next.getRep();
		this.next = output; 
		return output;
	}
	
	public int getRepDiff(){
		if (this.next.name == this.name){
			return 0;
		}
		else{
			this.next_diff += this.next.getRepDiff();
			return this.next_diff;
			
		}
	}
}

	UFTW_Node[] nodes;
	public static void main(String[] args){
		ArrayList<String> output = new ArrayList<String>();
		Main test = new Main();
		Scanner inputScanner = new Scanner(System.in).useDelimiter("\\s");
		int n = inputScanner.nextInt();
		int q = inputScanner.nextInt();
		test.nodes = test.makeArray(n);
		
		int type = -1;
		int x= -1;
		int y= -1;
		int z=0;
		for (int i=0;i<q;i++){
			type = inputScanner.nextInt();
			x = inputScanner.nextInt();
			y = inputScanner.nextInt();
			if(type ==0){
				z =inputScanner.nextInt();
				test.union(x,y,z);
			}
			if(type ==1){
				if(test.nodes[x].getRep().name == test.nodes[y].getRep().name){
				output.add(Integer.toString(test.same(x, y)));
				}
				else
					output.add("?");
			}
		} 
		for(String out : output){
			System.out.println(out.toString());
		}
	}
	public UFTW_Node[] makeArray(int num){
		UFTW_Node[] output = new UFTW_Node[num];
		for (int i=0; i<num;i++){
			output[i] = new UFTW_Node(i);
		}
	return output;
	}
	
	public void union(int x, int y,int z){
		int xdiff = nodes[x].getRepDiff();
		int ydiff = nodes[y].getRepDiff();
		UFTW_Node yRep = nodes[y].getRep();
		UFTW_Node xRep = nodes[x].getRep();
		if (yRep.rank> xRep.rank){
			xRep.next= yRep;
			xRep.next_diff = z - xdiff +ydiff;
		}
		else if(yRep.rank< xRep.rank){
			yRep.next= xRep;
			yRep.next_diff = ydiff -z -xdiff;
		}
		else{
			yRep.next= xRep;
			xRep.rank++;
			yRep.next_diff = ydiff -z -xdiff;
		}
	}
	
	public int same (int x, int y){
		return nodes[x].getRepDiff() -nodes[y].getRepDiff();
	}
}

