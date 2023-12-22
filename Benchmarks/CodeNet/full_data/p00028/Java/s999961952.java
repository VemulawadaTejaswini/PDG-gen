import java.util.Scanner;
 
class Main
{
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		int [] a = new int[110];
		int i;
		int max = 0;
 
		while (cin.hasNext()){
			i = cin.nextInt();
			a[i]++;
		}
 
		for (i = 0; i < 100; i++){
			if (max < a[i]){
				max = a[i];
			}
		}
 
		for (i = 0; i < 100; i++){
			if (max == a[i]){
				System.out.println(i);
			}
		}
	}
}