import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		(new Main()).universe();
	}

	HashMap<Integer, Integer> hashMap;

	void universe(){
		Scanner scanner = new Scanner(System.in);

		try{
			String str = new String();
			while((str = scanner.next()) != null){
				int n = Integer.parseInt(str);
				if(n == 0) return;

				hashMap = new HashMap<Integer, Integer>();
				System.out.println(scanA(n));

			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	String scanA(int n){
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < n; i++){
			Integer input_int = scanner.nextInt();
			//System.out.println(input_int);

			Integer map_value = hashMap.get(input_int);
			if(map_value != null){
				map_value++;
				if(map_value > n/2) return "" + input_int;
				hashMap.put(input_int,  map_value);
			}else{
				hashMap.put(input_int, 1);
			}
		}
		return "NO COLOR";
	}

	void printArray(ArrayList<Integer[]> array){
		for(int i = 0; i < array.size(); i++){
			printArray(array.get(i));
		}
	}

	static void printArray(Integer array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println("");
	}
}