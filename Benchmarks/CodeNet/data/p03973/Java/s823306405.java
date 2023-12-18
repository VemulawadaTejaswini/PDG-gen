import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum=0;
		Scanner in=new Scanner(System.in);
		
		int n;
		n=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		int maxlen=0;
		for(int i=0;i<n;i++){
			int v=in.nextInt();
			int k=(v-1)/(maxlen+1);
			if(k>1){
				sum+=k;
				v-=k*(maxlen+1);
				maxlen=Math.max(maxlen, v);
			}else if(k==1){
				sum++;
			}else if(k==0){
				maxlen=Math.max(maxlen, v);
			}
		}
		System.out.println(sum);

	}

}
