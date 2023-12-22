import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int list[] = new int[n];
			for(int i = 0;i < list.length;i++){
				list[i] = sc.nextInt();
			}
			for(int j = list.length - 1;j >= 0;j--){
				System.out.print(list[j]);
				if(j!=0)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

