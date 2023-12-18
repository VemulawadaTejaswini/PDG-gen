public class Main{
	public static void main(String[] argv){
		int N = in.nextInt();
		int[] goods = new int[N];
		int ans = 0;
		for(int i=0;i<N;i++){
			goods[i] = in.nextInt();
			ans += goods[i];
		}
		Arrays.sort(goods);
		ans -= goods[N-1]/2;
		System.out.println(ans);
	}

}