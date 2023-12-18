import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String S=scan.next();
		String d[]=S.split("");
		int total=0;
		int count=0;
		for(int i=0;i<N-2;i++){
			for(int j=i+1;j<N-1;j++){
				for(int k=j+1;k<N;k++){
					if(d[i].equals(d[j])||d[i].equals(d[k])||d[j].equals(d[k])||j-i==k-j){
						count++;
					}
					total++;
				}

			}
		}
		int ans=total-count;
		System.out.println(ans);
	}

}
