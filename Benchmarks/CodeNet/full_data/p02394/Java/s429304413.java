import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] input= sc.nextLine().split(" ");
		int W =Integer.parseInt(input[0]);
		int H =Integer.parseInt(input[1]);
		int x =Integer.parseInt(input[2]);
		int y =Integer.parseInt(input[3]);
		int r =Integer.parseInt(input[4]);
		if(r<=x || x<=W-r){
			if(r<=y || y<=H-r){
				System.out.println("Yes");
			}
		}else{
		//	System.out.println("No");
			System.out.print("No");
		}
	}
}