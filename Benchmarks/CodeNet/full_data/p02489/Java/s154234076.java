import java.util.ArrayList;
import java.util.Scanner;


class Main {
	Scanner sc;
	public void printH(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(x[x.length-1]);
	}
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				n.add(value);
			}
			else{
				break;
			}
		}

		for(int i = 0; i < n.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + n.get(i));
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}