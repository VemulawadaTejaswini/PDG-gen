import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		String[] sArray = s.split("");
		String[] tArray = t.split("");

		int num_times = sArray.length - tArray.length + 1;

		String part = new String();

		int count = 9999;
		int currentCount = 0; 

		for (int i = 0; i < num_times;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=i; j < i + tArray.length; j++){
				sb.append(sArray[j]);
			}
			part = sb.toString();

			String[] partArray = part.split("");
			for(int k = 0; k < tArray.length; k++){
				if(partArray[k] != tArray[k]){
					currentCount ++;
				}
				if(currentCount < count){
					count = currentCount;
				}
				currentCount = 0; 
				//System.out.println(count);
		}
	}
		System.out.println(count);
		sc.close();
	
}
}
