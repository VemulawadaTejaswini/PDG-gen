import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		int max=sc.nextInt();
		int tubun_cnt=0;

		int array[] = new int[max];

		for(int i=0;i<max;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		while(true) {

			for(int i=0;i<max;i++) {
				if(array[i]%2==0) {

				}
				else {
					/*for(int j=0;j<max;j++) {
						System.out.print(array[j]+" ");
					}
					System.out.println();*/

					System.out.println(tubun_cnt);
					return;

				}
			}
			for(int i=0;i<max;i++) {
				array[i]/=2;

			}
			tubun_cnt++;
			/*for(int j=0;j<max;j++) {
			System.out.print(array[j]+" ");
			}
			System.out.println();*/
		}

	}
}
