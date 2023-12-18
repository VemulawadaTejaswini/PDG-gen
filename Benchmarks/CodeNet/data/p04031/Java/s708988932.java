import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] integral=new int[number];
		int sum=0;
		int average=0;
		int ans=0;
		for(int i=0; i<number; i++){
			integral[i]=sc.nextInt();
			sum+=integral[i];
		}
		if(sum%number!=0){
			average=(sum/number)+1;
		}else{
			average=sum/number;
		}
		for(int i = 0; i<number; i++){
			ans+=(integral[i]-average)*(integral[i]-average);
		}
		System.out.println(ans);
	}
}