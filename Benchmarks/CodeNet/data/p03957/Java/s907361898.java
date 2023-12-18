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
		int flagC = 0;
		int flagF = 0;
		for(int i=0;i<arr2.length;i++){
			if(arr2[i].equals("C")){
				indexC = i;
				flagC = 1;
			}else if(arr2[i].equals("F")){
				indexF = i;
				flagF = 1;
			}
		}

		if(indexF>indexC && flagC==1 && flagF==1){
			flag = 1;
		}
		if(flag ==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}