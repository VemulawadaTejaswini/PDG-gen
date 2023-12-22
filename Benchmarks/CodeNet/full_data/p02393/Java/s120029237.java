import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		int[] a= new int[3];
		int t,i,flag=0;
		Scanner kbd = new Scanner(System.in);
		a[0] = kbd.nextInt();
		a[1] = kbd.nextInt();
		a[2]  = kbd.nextInt();
		for(;;){
			flag = 0;
			for( i=0;i<2;i++){
				if(a[i] >a[i+1]) {
					t=a[i];a[i] = a[i+1];a[i+1]=t;flag = 1;
				}
			}
			if(flag == 1) continue;	else break;
		}
		for( i=0;i<3;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}