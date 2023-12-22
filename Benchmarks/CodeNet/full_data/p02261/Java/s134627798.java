import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????°
		int num = Integer.parseInt(bf.readLine());
		
		//?????????
		
		String[] arrayString1 = bf.readLine().split(" ");
		String[] arrayString2 = arrayString1.clone();
		
		bubbleSort(arrayString1,num);
		System.out.println("Stable");
		selectionSort(arrayString2,num);
		if(isStable(arrayString1, arrayString2, num)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}
	
	private static void selectionSort(String[] arrayString, int num) {
		
		for(int i=0;i<num;i++){
			int min=i;
			for(int j=i;j<num;j++){
				if(getNum(arrayString[j])<getNum(arrayString[min])){
					min=j;
				}
			}
			if(min!=i){
			String tmp=arrayString[i];
			arrayString[i]=arrayString[min];
			arrayString[min]=tmp;
			
			}
		}
		
		for(int i=0;i<arrayString.length;i++){
			System.out.printf("%s",arrayString[i]);
			if(i!=arrayString.length-1){
				System.out.printf(" ");
			}
		}
		System.out.println("");
	}
	
	private static void bubbleSort(String[] arrayString, int num) {
		boolean flag=true;
		
		
		while(flag){
			flag=false;
			for(int i=num-1;i>=1;i--){
				if(getNum(arrayString[i])<getNum(arrayString[i-1])){
					String tmp=arrayString[i];
					arrayString[i]=arrayString[i-1];
					arrayString[i-1]=tmp;
					flag=true;
					
				}
			}
		}
		for(int i=0;i<arrayString.length;i++){
			System.out.printf("%s",arrayString[i]);
			if(i!=arrayString.length-1){
				System.out.printf(" ");
			}
		}
		System.out.println("");
	}
	public static  int getNum(String card){
		return Integer.parseInt(card.substring(1,2));
	}
	
	public static boolean isStable(String[] arrayString1,String[] arrayString2 ,int num){
		for(int i=0;i<num;i++){
			if(!arrayString1[i].equals(arrayString2[i])){
				return false;
			}
		}
		return true;
	}
}