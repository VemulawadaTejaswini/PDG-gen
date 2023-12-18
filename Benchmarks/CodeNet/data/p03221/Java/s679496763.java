import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long[] moto=new long[M];
		long[] sort=new long[M];
		int[] kosu=new int[100001];
		HashMap<Long,Long> unko=new HashMap<Long,Long>();

		for(int i=0; i<=100000; i++) {
			kosu[i]=0;
		}
		for(int i=0; i<M; i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			kosu[(int)a]++;
			moto[i]=a*1000000+b;
			sort[i]=moto[i];
		}
		Arrays.sort(sort);
		for(int i=0; i<M; i++) {
			unko.put(sort[i], (long)(i+1));
		}

		for(int i=0; i<M; i++) {
			long ans=unko.get(moto[i]);
			long tmp=moto[i]/1000000*1000000+ans-kosu[(int)(moto[i]/1000000-1)];
			String buu= String.valueOf(tmp);
			if(buu.length()==7) {
				System.out.println("00000"+buu);
			}

			else if(buu.length()==8) {
				System.out.println("0000"+buu);
			}

			else if(buu.length()==9) {
				System.out.println("000"+buu);
			}

			else if(buu.length()==10) {
				System.out.println("00"+buu);
			}

			else if(buu.length()==11) {
				System.out.println("0"+buu);
			}

			else {
				System.out.println(buu);
			}
		}
	}
}