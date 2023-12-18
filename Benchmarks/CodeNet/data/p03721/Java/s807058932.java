import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] h=new int[n];
		int ite=0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int buf=sc.nextInt();
			if(hm.containsKey(a)){
				hm.put(a, hm.get(a)+buf);
			//	System.out.println(a+" "+hm.get(a));
			}else{
				h[ite]=a;
			//	System.out.println("h["+ite+"]="+h[ite]);
				ite++;
				hm.put(a, buf);
			//	System.out.println(a+" "+hm.get(a));
			}
		}
		Arrays.sort(h);
		int i=0;
		while(h[i++]==0){
		}
		while(k>0&&i<ite){
		//	System.out.println(i);
			k-=hm.get(h[i++]);
		}
		System.out.println(h[--i]);
	}
}
