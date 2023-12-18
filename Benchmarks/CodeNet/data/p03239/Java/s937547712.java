import java.util.*;

class Main{
	static Scanner scan = new Scanner(System.in);
	static void programmingEducation(){
		int age = scan.nextInt();
		if(age == 1){
			System.out.println("Hello World");
		}
		else{
			int a = scan.nextInt(), b = scan.nextInt();
			System.out.println(a+b);
		}
		
	}
	
	static void timeLimit(){
		int n = scan.nextInt(), t = scan.nextInt();
		ArrayList<Integer> costs = new ArrayList<>();
		for(int i=0;i<n;i++){
			int input = scan.nextInt(), time = scan.nextInt();
			if(time<=t)
				costs.add(input);
		}
		Collections.sort(costs);
		if(costs.isEmpty())
			System.out.println("TLE");
		else{
			int cost = costs.get(0);
			System.out.println(cost);
		}
	}
	
	public static void main(String[] argv){
		//programmingEducation();
		timeLimit();
	}
	
}