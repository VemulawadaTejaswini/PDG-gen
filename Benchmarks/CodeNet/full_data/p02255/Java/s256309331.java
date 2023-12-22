import java.util.*;

public class Main {
	public static void main(String[] a){
		Scanner input=new Scanner(System.in);
		int loop=input.nextInt();
		int[] keepNum=new int[loop];
		
		for(int i=0;i<loop;i++)
			keepNum[i]=input.nextInt();
		
		for(int i=1;i<keepNum.length;i++){
			int insert=keepNum[i];
			int j=i-1;
			
			while(j>=0 && keepNum[j]>insert){
				keepNum[j+1]=keepNum[j];
				j--;
			}
			keepNum[j+1]=insert;
			
		for(int k=0;k<keepNum.length;k++)
			System.out.print(keepNum[k]+" ");
		System.out.println();
			
		}
	
	}

}