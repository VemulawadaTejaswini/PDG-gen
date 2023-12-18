import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Integer> maxBlackHorizontal(int[][] array){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int size = array.length;
		int counter = 0;
		for (int i = 0; i <size ; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j]==1) {
					counter++;
				}
			}
			map.put(counter, i);
			counter = 0;
		}
		ArrayList<Integer> max_indices = new ArrayList<Integer>();
		int max  = Collections.max(map.keySet());
		max_indices.add(max);
		for(Integer i : map.keySet()) {
		    if(i == max){
		    	max_indices.add(map.get(i));
		    }
		}
		return max_indices;
	}
	
	public static int howManyVertical(int[][] array){
		int size = array.length;
		int counter = 0;
		for (int i = 0; i <size ; i++) {
			for (int j = 0; j < size; j++) {
				if (array[j][i]!=1) {
					break;
				}
				if(j == size-1){
					counter ++;
				}	
			}
		}
		return counter;
	}
	public static boolean hasBlackVertical(int[][] array, int index){
		int size = array.length;
			for (int j = 0; j < size; j++) {
				if (array[j][index]==1) {
					return true;
				}
			}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[][] square = new int[size][size];
		for (int i = 0; i < size; i++) {
			String line = s.next();
			for (int j = 0; j < size; j++) {
				if (line.charAt(j) == '#') {
					square[i][j] = 1;
				}
			}
		}
		ArrayList<Integer> max_indices = maxBlackHorizontal(square);
		int maxBlackHorizontal = max_indices.get(0);		
		if(maxBlackHorizontal == size){
			System.out.println(size - howManyVertical(square)); 
		}else if(maxBlackHorizontal ==0){
			System.out.println(-1); 
		}else{
			boolean flag = false;
			for (int i = 1; i < max_indices.size(); i++) {
				if(hasBlackVertical(square, max_indices.get(i))){
					System.out.println(size - maxBlackHorizontal+ size - howManyVertical(square));
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println(size - maxBlackHorizontal+ 1 + size - howManyVertical(square));
			}
		}		
	}

}
