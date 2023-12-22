
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		AdjacencyMatrices am = new AdjacencyMatrices(scan.nextInt());
		am.readList(scan);
		am.printMatrix();
	}

}
class AdjacencyMatrices{
	int pointNum;
	int[][] matrix;
	public AdjacencyMatrices(int n){
		pointNum = n;
		matrix = new int[n][];
		for(int i=0; i<n; i++)
			matrix[i] = new int[n];
	}
	public void readList(Scanner scan){
		for(int i=0; i<pointNum; i++){
			int index = scan.nextInt()-1;
			int dim = scan.nextInt();
			for(int j=0; j< dim; j++)
				matrix[index][scan.nextInt()-1] = 1;
		}
	}
	public void printMatrix(){
		StringBuilder temp = new StringBuilder();
		for(int i=0; i<pointNum; i++){
			for(int j=0; j<pointNum; j++){
				temp.append(matrix[i][j]);
				if(j!=pointNum-1)
					temp.append(" ");
			}
			temp.append("\n");
		}
		System.out.print(new String(temp));
	}

}