import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] nums = input.split(" ", 0);
			
			// ノード数
			int nodesN = Integer.parseInt(nums[0]);
			
			String[][] links = new String[nodesN][2];
			
			// 枝の両端の頂点n
			int linksInt[][] = new int[nodesN][2];
			
			// 頂点nに何本の枝が接続しているか
			int connectedBranch[] = new int[nodesN];
			
			// 頂点nに書かれた番号
			int numberOnNode[] = new int[nodesN];
			
			for(int i=0;i<nodesN-1;i++){
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				
				links[i] = input.split(" ", 0);
				linksInt[i][0] = Integer.parseInt(links[i][0]);
				linksInt[i][1] = Integer.parseInt(links[i][1]);
				
				connectedBranch[linksInt[i][0]-1]++;
				connectedBranch[linksInt[i][1]-1]++;
			}
			
			input = scanner.nextLine();
			
			// 書かれる番号
			String[] writeNumbers_str = input.split(" ", 0);
			int writeNumbers[] = new int[nodesN];
			
			for(int i=0;i<nodesN;i++){
				writeNumbers[i] = Integer.parseInt(writeNumbers_str[i]);
			}
			
			
			for(int i=0;i<nodesN;i++){
				// リンク数の少ないノードのインデックス
				int writeNodeIndex = getNotZeroSmallestIndex(connectedBranch);
				
				// 残っている最小値のインデックス
				int smallestNumberIndex = getNotZeroSmallestIndex(writeNumbers);
				
				// 残っている最小値を書き込む
				numberOnNode[writeNodeIndex] = writeNumbers[smallestNumberIndex];
				
				// チェックしたノードと値は消去
				connectedBranch[writeNodeIndex] = 0;
				writeNumbers[smallestNumberIndex] = 0;
			}
			
			// 枝に書かれた数値の合計
			int sum = 0;
			for(int i=0;i<nodesN-1;i++){
				int nodeAindex = linksInt[i][0]-1;
				int nodeBindex = linksInt[i][1]-1;
				
				sum += Math.min(numberOnNode[nodeAindex], numberOnNode[nodeBindex]);
			}
			System.out.println(sum);
			
			for(int i=0;i<nodesN;i++){
				System.out.print(numberOnNode[i] + " ");
			}
			System.out.println();
			
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
	
	public static int getNotZeroSmallestIndex(int[] array){
		int smallestNum = array[0];
		int smallestIndex = 0;
		for(int i=0;i<array.length;i++){
			if(smallestNum == 0){
				smallestNum = array[i];
				smallestIndex = i;
			}
			if(array[i] != 0 && array[i] < smallestNum){
				smallestNum = array[i];
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}
}