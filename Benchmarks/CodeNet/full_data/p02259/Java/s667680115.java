

import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sortLong=input.nextInt();
		
		int[] sortNumber=new int[sortLong];
		
		for(int i=0;i<sortLong;i++)
			sortNumber[i]=input.nextInt();
		
		int number=sort(sortNumber);
		
		for(int i=0;i<sortNumber.length-1;i++)
			System.out.print(sortNumber[i]+" ");
		System.out.println(sortNumber[sortNumber.length-1]);
		System.out.println(number);
		
	}
	
	public static int sort(int[] sortArray){
		int minNumber;
		int changeFrequency=0;
		
		for(int i=0;i<sortArray.length-1;i++){
			for(int j=0;j<sortArray.length-1;j++){
				if(sortArray[j]>sortArray[j+1]){
					minNumber=sortArray[j+1];
					
					sortArray[j+1]=sortArray[j];
					sortArray[j]=minNumber;
					
					changeFrequency++;
				}
				
			}
		}
		
		return changeFrequency;
	}

}