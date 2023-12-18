import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		long n=sc.nextLong();
		//long k=sc.nextLong();
		//String s=sc.next();
		//long[] array=new long[n];
		double sum=1,buff,max=0,min=0;
		//int[] array=new int[l];
		//String s="",m="",h="";

		for(long i=n;i>=1;i--) {
			buff=Math.sqrt(i);
			max=(long)buff;
			if(buff-max==0) {
				System.out.println(i);
				break;
			}

			//System.out.println(sum);
		}
		//Arrays.sort(array)
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


