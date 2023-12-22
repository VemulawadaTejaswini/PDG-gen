import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ah,bh;
		int as=0,bs=0;
		int[] as_a=new int[10000];
		int[] bs_a=new int[10000];
		int i=0;
		try{
			while(true){
				int n=sc.nextInt();
				if(n==0) break;
				for(int j=0;j<n;j++){
					ah=sc.nextInt();
					bh=sc.nextInt();
					if(ah>bh) as+=ah+bh;
					else if(ah<bh) bs+=ah+bh;
					else {as+=ah;bs+=bh;}
				}
				as_a[i]=as;bs_a[i++]=bs;
				as=0;bs=0;
			}
			sc.close();
			System.out.println("");
			for(int j=0;j<i;j++){
				System.out.println(as_a[j]+" "+bs_a[j]);
			}
		}catch(Exception e){
			System.out.println("Error");
		}
	}
}