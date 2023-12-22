import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] stock = new int[100];
		int i = 0;
		int x;
		
		do{
			x = sc.nextInt();
			stock[i] = x; 
			i++;
		}while(x != 0);
		
		int[] data = new int[i];
		
		for(int j = 0;j < i;j++){
			data[j] = stock[j];
			System.out.println("case "+(j + 1)+": "+ data[j]);
		}
	}
}