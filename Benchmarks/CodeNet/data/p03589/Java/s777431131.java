import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h = 0;
		int n = 0;
		int w = 0;
		for(int i=1; i<=N*3/4; i++){
			for(int j=1; j<=3500; j++){
				if(4*i*j-N*i-N*j>0 && (N*i*j)%(4*i*j-N*i-N*j)==0){
					h = i;
					n = (N*i*j) / (4*i*j-N*i-N*j);
					w = j;
					break;
				}
			if(h!=0)break;
			}
		}
		System.out.println(h + " " + n + " " + w);
	}
}