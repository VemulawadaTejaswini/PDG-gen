import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int array[];
		int i = 0;
		int count =1;
		array = new int[100];
		while(i=0){
			int array[count] = sc.nextInt();
			if(array[count]!=0){
				count++;
			}else{
				i++;
			}
		}
		int k ;
		for(k=1;k<=count;k++){
			System.out.println("Case "+i+":"+array[k]);
		}
	}
}