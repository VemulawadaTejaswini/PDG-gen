public class Main
{
	
	private static int N;//辖区数
	private static int M;//城市数
	private static int area[];//辖区数组
	private static int city[];//城市数组
	private static ArrayList<Integer> p[];
	private static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		area = new int[M];
		city = new int[M];
		p = new ArrayList[M];
		for(int i=0;i<M;i++){
			area[i] = sc.nextInt();
			city[i] = sc.nextInt();
			if(p[area[i]]==null) p[area[i]] = new ArrayList<Integer>();
			p[area[i]].add(city[i]);
		}
		
		for(int j=1;j<=N;j++){
			Collections.sort(p[j]);
		}
		for(int k=0;k<M;k++){
			int pos = p[area[k]].indexOf(city[k])+1;
			String str = String.format("%06d%06d", area[k],pos);
			System.out.println(str);
		}
	}
}