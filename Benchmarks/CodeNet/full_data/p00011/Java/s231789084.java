import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] hor = new int[n][2];
		for(int i = 0; i < n; i++){
			String str = sc.next();
			//System.out.println(str);
			hor[i][0] = Character.getNumericValue(str.charAt(0));
			//System.out.println(hor[i][0]);
			hor[i][1] = Character.getNumericValue(str.charAt(2));
			//System.out.println(hor[i][1]);
		}
		
		int[] ver = new int[w];
		for(int i = 0; i < w; i++){
			int num = i + 1;
			for(int j = 0; j < n; j++){
				if(num == hor[j][0]){
					num = hor[j][1];
				}
				else if(num == hor[j][1]){
					num = hor[j][0];
				}
			}
			ver[num - 1] = i + 1;
			//System.out.println(num);
		}
		for(int i = 0; i < w; i++){
			System.out.println(ver[i]);
		}
	}

}