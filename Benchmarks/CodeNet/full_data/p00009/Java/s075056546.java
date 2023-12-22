import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean index[]=new boolean[1000000];
		Arrays.fill(index, true);//
		index[0]=false;index[1]=false;
		for(int i=0;i<index.length;i++){
			if(index[i]){
				for(int j=i+i;j<index.length;j+=i){
					index[j]=false;
				}
			}
		}
		while(sc.hasNext()){
			int cnt=0;
			int n=sc.nextInt();
			for(int i=0;i<=n;i++){
				if(index[i])cnt++;
			}
			System.out.println(cnt);
		}
	}
}  