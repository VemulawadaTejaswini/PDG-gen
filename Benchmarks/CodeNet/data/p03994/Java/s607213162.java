import java.util.*;

public class Main{

	public static int getMax(int[] arr){
		int max = 0;
		
		for(int i = 1; i < arr.length;i++){
			if(arr[i]>arr[max])
				max = i;
		}
		return max;
	}
	
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int remain = sc.nextInt();
		char[] charArray = s.toCharArray();
		int[] intArray = new int[charArray.length];
		
		for(int i = 0; i < charArray.length;i++){
			intArray[i] = charArray[i] - 'a' + 1;
		}
		
		int temp = 0;
		int getMax = 0;
		while(remain > 0){
			getMax = getMax(intArray);
			temp = 27-intArray[getMax];
			if(remain < temp){
				intArray[getMax] +=remain;
				remain = 0;
			}
			else{
				intArray[getMax] =1;
				remain -=temp;
			}
		}
		
		String ret = "";
		
		for(int i = 0; i < intArray.length;i++){
			ret += ((char) (intArray[i]+'a' - 1));
		}

		System.out.println(ret);
	}

}