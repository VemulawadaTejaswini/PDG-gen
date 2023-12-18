import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		//List<Integer> list=new ArrayList<Integer>();

		int h = sc.nextInt();
		int w = sc.nextInt();
		Integer[][] array = new Integer[h][w];
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(h==w&&a==b&&h%a==0) {
			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					array[i][j]=0;
				}
			}
			for(int i=0;h>i;i++) {
				array[i][i]=1;
			}

			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					System.out.print(array[i][j]);
				}
				System.out.println("");
			}
		}

		else if(a==0) {
			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					array[i][j]=0;
				}
			}
			for(int i=0;b>i;i++) {
				array[i][0]=1;
			}
			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					System.out.print(array[i][j]);
				}
				System.out.println("");
			}

		}
		else if(b==0) {
			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					array[i][j]=0;
				}
			}
			for(int i=0;a>i;i++) {
				array[0][i]=1;
			}
			for(int i=0;h>i;i++) {
				for(int j=0;w>j;j++) {
					System.out.print(array[i][j]);
				}
				System.out.println("");
			}
		}

		else {
			System.out.println("No");
		}


	}

}