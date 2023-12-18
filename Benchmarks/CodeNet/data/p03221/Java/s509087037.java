public class Main{
	static int N,M;
	static int[][] arr;
	static boolean[] visited;
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[N+1][100];
		visited=new boolean[N+1];
		int[] orginal=new int[M];
		Map<Integer, String> result = new LinkedHashMap<Integer, String>();

		for(int i=0;i<M;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			orginal[i]=y;
			arr[x][y]=1;
			}
		
		for(int i=1;i<=N;i++) {
			visited[i]=true;
			count=1;
			for(int j=1;j<100;j++) {
				if(arr[i][j]==1) {
					String xiaquid = String.format("%06d",Integer.valueOf(i));
					String cityorder = String.format("%06d",Integer.valueOf(count));
					String cityid=xiaquid+cityorder;
					result.put(j, cityid);
					count++;
				}
			}
		}
		for(int i=0;i<M;i++) {
			System.out.println(result.get(orginal[i]));
			}
		}
}