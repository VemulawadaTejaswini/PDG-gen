import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] mtn = new int[10];
		for(int i = 0; i<mtn.length; i++){
			mtn[i] = sc.nextInt();
		}
		for(int i = 0; i<mtn.length-1; i++){
			for(int j = i+1; j<mtn.length; j++){
				if(mtn[i] < mtn[j]){
					int tmp;
					tmp = mtn[i];
					mtn[i] = mtn[j];
					mtn[j] = tmp;
				}
			}
		}
		for(int i = 0; i<3; i++)
			System.out.println(mtn[i]);
	}
}