import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] C = S.toCharArray();
		sc.close();

		int cnt = 0;
		char[] RGB = {'R', 'G', 'B'}; 
		for(int i=0; i<N; i++){
			char s1 = C[i];
			for(int j=i+1; j<N; j++){
				char s2 = C[j];
				if(s1==s2){
					continue;
				}
				char s3 = 'R';
				boolean R = true;
				boolean G = true;
				boolean B = true;
				if(s1=='R' || s2=='R'){
					R = false;
				}
				if(s1=='G' || s2=='G'){
					G = false;
				}
				if(s1=='B' || s2=='B'){
					B = false;
				}

				if(R){
					s3 = 'R';
				}else if(G){
					s3 = 'G';
				}else{
					s3 = 'B';
				}

				for(int k=j+1; k<N; k++){
					if(s3==C[k]){
						cnt++;
					}
				}
			}
		}
		
		System.out.printf("%d\n", cnt);
	}
}