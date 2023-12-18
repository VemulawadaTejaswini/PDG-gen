import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		int c = 0;
		
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}		
		for(int i = 0; i<array.length-1; i++) {
			if (array[i] >= array[i+1])
            {	
              c++;
            }
          	else
            {
              c=0;
            }
		}
		System.out.println(c);
	}
}