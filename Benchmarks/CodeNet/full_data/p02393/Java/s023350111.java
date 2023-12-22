import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int list[] = new int[3];
	for(int i = 0; i < 3; i++){
		list[i] = sc.nextInt();
	}

	Arrays.sort(list);

	for(int j = 0; j < 3; j++)
		if(j == 2)
		System.out.print(list[j]);
		else
		System.out.print(list[j] + " ");
	sc.close();
	}
}