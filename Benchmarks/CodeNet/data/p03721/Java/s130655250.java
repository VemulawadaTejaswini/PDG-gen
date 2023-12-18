import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] h=new int[n];
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
			int buf=sc.nextInt();
			if(hm.containsKey(h[i])){
				hm.put(h[i], hm.get(h[i])+buf);
			}else{
				hm.put(h[i], buf);
			}
		}
		Arrays.sort(h);
		int ans=0;
		int pre=-1;
		int ite=0;
		while(k>0){
			if(pre==h[ite]){
				ite++;
				continue;
			}
			k-=hm.get(h[ite]);
			pre=h[ite];
			ite++;
		}
		System.out.println(pre);
	}
}
