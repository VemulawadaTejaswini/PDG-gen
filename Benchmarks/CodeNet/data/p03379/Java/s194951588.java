import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for(int n=0;n<N;n++){
			arr.add(sc.nextInt());
		}

		for(int n=0;n<N;n++){
			ArrayList<Integer> cop = new ArrayList<>(arr);
			
			cop.remove(n);
			Collections.sort(cop);


			System.out.println(cop.get(N/2-1));
		}
	}
}