import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String a[]=S.split("");
		long N=a.length;
		String all="";
		int count=0;
		for(long i=0;i<N;i++){
			all="";
			for(long j=i;j<N;j++){
				all=all+a[(int) j];

				if(Long.parseLong(all)%2019==0){
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
