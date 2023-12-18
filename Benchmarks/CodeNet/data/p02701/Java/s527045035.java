import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String S[]=new String[N];
		int count=0;
		for(int i=0;i<N;i++){
			S[i]=scan.next();
			if(i==0){
				count++;
			}
			for(int j=0;j<i;j++){
				if(S[j].equals(S[i])){
					break;
				};
				if(j==i-1){
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
