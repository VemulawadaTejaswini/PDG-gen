import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d_set=sc.nextInt();
		int[] ary=new int[d_set];
		for(int i=0; i<d_set; i++) {
			ary[i]=sc.nextInt();
		}
		int min=114514810;
		int max=-114514810;

		for(int i=0; i<d_set; i++) {
			if(min>ary[i]) {
				min=ary[i];
			}
			if(max<ary[i]) {
				max=ary[i];
			}
		}
		System.out.println(max-min);
	}
}