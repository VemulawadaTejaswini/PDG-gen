import java.util.*;
public class Main {
	static long[] visited ;
	static long[] teleport_to;
	static List<Integer> histry = new ArrayList<>();
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans=0;
		visited = new long[(int) (N+1)];
		teleport_to= new long[(int) (N+1)];

		for(int i=1;i<=N;i++){
			teleport_to[i]=sc.nextLong();
		}
		visited[1]=1;
		histry.add(1);
		func(1);
		int roop_root = histry.get(histry.size()-1);
		histry.remove(histry.size()-1);
		int length=histry.size();
		int from_1_to_roop = histry.indexOf(roop_root);
		if (K<=from_1_to_roop) {
			ans=histry.get((int) (K-1));
			System.out.println(ans);

		}
		else
		{
			ans=(K-from_1_to_roop)%(length-from_1_to_roop);
			ans=histry.get((int) (from_1_to_roop+ans));
			System.out.println(ans);
		}

    }
    public static void func(int arg){
    	int from = arg;
    	int next = (int) teleport_to[from];
    	if (visited[(int) next]==1) {
    		histry.add((int) next);
    		return;

    	}
    	else{
    		histry.add((int) next);
    		visited[(int) next]=1;
    		func(next);
    	}
    }
}