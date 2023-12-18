import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] arr2 = str.split("");

		int count = 0;
		int indexC = 0;
		int indexF = 0;
		int flag = 0;
		for(int i=0;i<arr2.length;i++){
			if(arr2[i].equals("C")){
				indexC = i;
			}else if(arr2[i].equals("F")){
				indexF = i;
			}
		}
		if(indexF>indexC){
			flag = 1;
		}
		if(flag ==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}