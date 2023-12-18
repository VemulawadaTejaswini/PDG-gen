import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int w=scanner.nextInt();
		int h=scanner.nextInt();
		int n=scanner.nextInt();

		Map<Integer,Integer> data=new TreeMap<Integer,Integer>();


			data.put(1,0);
			data.put(2,w);
			data.put(3,0);
			data.put(4,h);


		for(int i=0;i<n;i++) {
			int bufx=scanner.nextInt();
			int bufy=scanner.nextInt();
			int bufa=scanner.nextInt();

			if(bufa==1) {

				if(data.get(1)==0) {
					data.put(1,bufx);
				}else {
					if(bufx>data.get(1)) {
						data.put(1,bufx);
					}
				}
			}else if(bufa==2) {

				if(data.get(2)==w) {
					data.put(2,bufx);
				}else {
					if(bufx<data.get(2)) {
						data.put(2,bufx);
					}
				}


			}else if(bufa==3) {

				if(data.get(3)==0) {
					data.put(3,bufy);
				}else {

				if(bufy>data.get(3)) {
					data.put(3,bufy);
				}

				}
			}else {

				if(data.get(4)==h) {
					data.put(4,bufy);
				}else {
					if(bufy<data.get(4)) {
						data.put(4,bufy);
					}
				}
			}

		}

		int retwidth=data.get(2)-data.get(1);
		int retheight=data.get(4)-data.get(3);

		int result=retwidth*retheight;

		if(retwidth>0 && retheight>0) {
			System.out.println(result);
		}else {
			System.out.println("0");
		}

		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {

			result+=n%10;

			if(n/10!=0) {
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



}





