import java.util.Scanner;

public class Main {
	  public static void main(String[] agrs){

		  
		   Scanner x = new Scanner(System.in);
			int data [] = new int[8];
			for(int i = 0;i<8;i++) {
				data[i]=x.nextInt();
			}
			int count = 0;
			for(int i = 0;i < data.length;i++) {
				for(int j = i + 1; j<data.length;j++) {
				if(data[i]>data[j]) {
					int a = data[i];
					data[i] = data[j];
					data [j]= a;
					count ++;
				}
			}
		  }
			System.out.println(count);
			x.close();
		 }
}
