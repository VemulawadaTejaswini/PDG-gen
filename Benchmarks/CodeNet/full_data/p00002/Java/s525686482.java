import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] kekka = new int[200];
		int count = 0;
	        while(scanner.hasNext()) {
        		int a = scanner.nextInt();
			int b = scanner.nextInt();
			kekka[count] =  String.valueOf( a+b ).length();
			count++;
        	}
		for(int i = count ; i == 0 ; i--){
			System.out.println(kekka[i]);
		}
    	}
}