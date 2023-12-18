import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		String[] imgA;
		String[] imgB;
		Boolean checkAB;
		int j;
		int k;
		String s = "No";
		for(int i = 0;i<N;i++){
			imgA[i]="";
			imgA[i]=sc.next();
		}
		for(int i = 0;i<M;i++){
			imgB[i]="";
			imgB[i]=sc.next();
		}
		for(int i=0;i<(N-M+1);i++){
			for(j=0;j<(N-M+1);j++){
				checkAB = true;
				for (k=0;j<M;j++){
					checkAB = (checkAB) && (imgA[j+k].substring(i, i+M)==imgB[k]);
				}
				if(checkAB){
					s="Yes";
				}
			}
		}
		System.out.println(s);
		sc.close();
        }
}