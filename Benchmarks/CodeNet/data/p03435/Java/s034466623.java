import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] ab = new int[3][3];
		
		ab[0][0] = sc.nextInt();
		ab[0][1] = sc.nextInt();
		ab[0][2] = sc.nextInt();
		ab[1][0] = sc.nextInt();
		ab[1][1] = sc.nextInt();
		ab[1][2] = sc.nextInt();
		ab[2][0] = sc.nextInt();
		ab[2][1] = sc.nextInt();
		ab[2][2] = sc.nextInt();
		

		if(diff_check(ab,0,1,true)&&
				diff_check(ab,0,2,true)&&
				diff_check(ab,1,2,true)&&
				diff_check(ab,0,1,false)&&
				diff_check(ab,0,2,false)&&
				diff_check(ab,1,2,false))
		System.out.println( "Yes");
		else
			System.out.println( "No");
	}

	private static boolean diff_check(int[][] ab, int i, int j, boolean b) {
		
		int point;
		
		if(b){
			point = ab[i][0]-ab[j][0];
			if(point!=ab[i][1]-ab[j][1])	return false;
			if(point!=ab[i][2]-ab[j][2])	return false;
		}else{
			point = ab[0][i]-ab[0][j];
			if(point!=ab[1][i]-ab[1][j])	return false;
			if(point!=ab[2][i]-ab[2][j])	return false;
		}
		
		return true;
		
	}
}