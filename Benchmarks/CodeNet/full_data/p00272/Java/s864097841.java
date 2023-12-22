import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for(int i = 0; i < 4; i++){
			int x = sc.nextInt();
			switch(x){
			case 1: a[i] = sc.nextInt() * 6000;
			break;
			case 2: a[i] = sc.nextInt() * 4000;
			break;
			case 3: a[i] = sc.nextInt() * 3000;
			break;
			case 4: a[i] = sc.nextInt() * 2000;
			}
		}
		for(int i = 0; i < 4; i++)
			System.out.println(a[i]);
		
		}
	}