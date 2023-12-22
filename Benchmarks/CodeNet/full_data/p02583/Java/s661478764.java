import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] lengthList = br.readLine().split(" ");

		int numOfCombination = 0;
		for(int i1=0; i1 < num; i1++){
			for(int i2=i1+1; i2 < num; i2++){
				for(int i3=i2+1; i3 < num; i3++){
					int[] lengthArr = new int[]{Integer.parseInt(lengthList[i1]), Integer.parseInt(lengthList[i2]), Integer.parseInt(lengthList[i3])};
					if(canCreateTriangle(lengthArr)){
						numOfCombination++;
					}
				}
			}
		}
		System.out.println(numOfCombination);
	}

	public static boolean canCreateTriangle(int[] lengthArr){
		boolean canCreate = false;
		Arrays.sort(lengthArr);
		if(lengthArr[2] < (lengthArr[0] + lengthArr[1])){
			if(lengthArr[0] != lengthArr[1] && lengthArr[1] != lengthArr[2]){
				canCreate = true;
			}
		}
		return canCreate;
	}
}