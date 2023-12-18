import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_tree=new ArrayList<Integer>();
		//List<Integer> list_add=new ArrayList<Integer>();
		int m = sc.nextInt();
		int d = sc.nextInt();

		int count=0;

		for(int i=1;m+1>i;i++) {
			for(int j =1;d+1>j;j++) {
				int ten= j/10;
				int one = j%10;
				if(ten>=2&&one>=2&&i==ten*one) {
					count++;
				}
			}

		}

		System.out.println(count);

	}

}