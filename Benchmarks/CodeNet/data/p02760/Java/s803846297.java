import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		int[][] array = new int[3][3];
		for(int i=0;3>i;i++) {
			for(int j=0;3>j;j++) {
				int a = sc.nextInt();
				array[i][j] = a;
			}
		}

		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			for(int j=0;3>j;j++) {
				for(int k=0;3>k;k++) {
					if(array[j][k]==a)
						array[j][k]=0;
				}
			}
		}

		for(int i=0;3>i;i++) {
			if(array[i][1]==array[i][2] && array[i][0]==array[i][1]) {
				System.out.println("Yes");
				System.exit(0);
			}
		}

		for(int i=0;3>i;i++) {
			if(array[1][i]==array[2][i] && array[0][i]==array[1][i]) {
				System.out.println("Yes");
				System.exit(0);
			}
		}

		if(array[0][0]==array[1][1] && array[0][0]==array[2][2]) {
			System.out.println("Yes");
			System.exit(0);
		}

		if(array[2][0]==array[1][1] && array[2][0]==array[0][2]) {
			System.out.println("Yes");
			System.exit(0);
		}

		System.out.println("No");
	}
}