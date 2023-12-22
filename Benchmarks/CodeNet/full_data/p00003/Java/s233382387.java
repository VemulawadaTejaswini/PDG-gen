import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int T[]=new int[3];
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++)
				T[j]=scanner.nextInt();
			Arrays.sort(T);
			if(T[0]*T[0]+T[1]*T[1]==T[2]*T[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}