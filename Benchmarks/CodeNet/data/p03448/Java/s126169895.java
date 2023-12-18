import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fh,oh,ft,result,count;
		count = 0;
		fh = sc.nextInt();
		oh = sc.nextInt();
		ft = sc.nextInt();
		result = sc.nextInt();
		for(int i=0;i<=fh;i++){
			for(int j=0;j<=oh;j++){
				for(int l=0;l<=ft;l++){
					if(i*500 + j*100 + l*50 == result){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}