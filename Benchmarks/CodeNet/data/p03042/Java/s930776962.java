import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int f=a/100;
		int l=a%100;
		String ans="NA";
		if((l>=1&&l<=12)&&(f>=1&&f<=12))
			ans="AMBIGUOUS";
		else if(l>=1&&l<=12)
			ans="YYMM";
		else if(f>=1&&f<=12)
			ans="MMYY";
		System.out.println(ans);

	}
}