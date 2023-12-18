import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());
		int G = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		int ans = 0;
		int i=0;int j=0;int k= 0;
		for(i =0;i*R <= N;i++){
			for(j =0;j*G <= N;j++){
				for(k =0;i*R+j*G+k*B <= N;k++){
					if(i*R+j*G+k*B==N) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);

	}
}