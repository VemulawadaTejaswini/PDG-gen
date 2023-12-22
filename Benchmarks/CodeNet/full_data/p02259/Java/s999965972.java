import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int [] b = new int[a];
		int count = 0;
		
		for(int i = 0 ; i < a ; i++) {
			b[i] = input.nextInt();
		}
		
		for(int i = 0 ; i < a - 1 ; i++) {
			for(int j = 0 ; j < a - 1 - i ; j++) {
				if(b[j] > b[j+1]) {
					int first = b[j];
					b[j] = b[j + 1];
					b[j + 1] = first;
					count += 1;
				}
			}
		}
		
		for (int i = 0 ; i < b.length ; i++) {
            System.out.print(b[i]);
            if(i != b.length-1) {
            	System.out.print(" ");
            }     
        }
		System.out.println();
		System.out.println(count);
		
	}
	

}

