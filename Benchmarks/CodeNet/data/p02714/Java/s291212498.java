import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String S=scan.next();
		String d[]=S.split("");
		int NR=0;
		int NG=0;
		int NB=0;
		int count=0;
		for(int i=0;i<N;i++){
			if(d[i].equals("R")){
				NR++;
			}
			if(d[i].equals("G")){
				NG++;
			}
			if(d[i].equals("B")){
				NB++;
			}
		}
		int total=NR*NG*NB;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i<j&&j<2*j-i&&2*j-i<N){
					if((!(d[i].equals(d[j]))&&!(d[i].equals(d[2*j-i]))&&!(d[j].equals(d[2*j-i])))){
						count++;
					}
				}
			}
		}
		System.out.println(total-count);
	}

}
