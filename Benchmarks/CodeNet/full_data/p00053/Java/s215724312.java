import java.util.*;

class Main{
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 2;i <= 10000;i++){
			boolean b = true;
			for(int j = 0;j < al.size();j++){
				if(i % al.get(j) == 0){
					b = false;
					break;
				}
			}
			if(b){
				al.add(i);
				// System.out.println(" " + i);
			}
		}
		al.add(0,0);
		for(int i = 1;i < al.size();i++){
			al.set(i, al.get(i - 1) + al.get(i));
		}
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			System.out.println("" + al.get(n));
		}
	}
}