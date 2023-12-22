import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] S  = new String[25];
		char K[] = sc.next().toCharArray();
		int c = 0;
		int b = 0;
		int abs[] = new int[K.length];
		boolean cnt;
		int ans = 0;
		int d = 0;
		int e =0;
		for(int i=0;i<N;i++){
			S[i] = sc.next();
		}  
		for(int i=0;i<N;i++){
			for(int j=i;j<K.length;j++){
				c = S[i].indexOf(K[j]);
				d = Math.abs(c-b);
				abs[j]=Math.abs(d-1);
				if(abs[j]==e){
					cnt=true;
				}else{
					cnt=false;
				}
				e = abs[j];
				if(cnt==true){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
		
}