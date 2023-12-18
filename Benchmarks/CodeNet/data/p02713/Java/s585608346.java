
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=k;i++){
			for(int j=1;j<=k;j++){
				if (i < j){
					list.add(gcd(j,i));
				}
				else{
					list.add(gcd(i,j));
				}
			}
		}
		for(int i=1;i<=k;i++){
			for(int j=0;j<list.size();j++){
				if (i < list.get(j)){
					sum += gcd(list.get(j), i);
				}
				else{
					sum += gcd(i, list.get(j));
				}
			}
		}
		System.out.println(sum);
	}

	public static int gcd(int x, int y){
		int z = x%y;
		if(z!=0){
			return gcd(y, z);
		}
		return y;
	}
}