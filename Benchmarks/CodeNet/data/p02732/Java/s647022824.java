import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n= sc.nextInt();
		int arr[] = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i] = sc.nextInt();
		long occ[] = new long[(int)2e5+1];
		HashMap<Integer,Long> hm = new HashMap<>();
		for(int i=1;i<=n;i++){
			occ[arr[i]]+=1;
			hm.put(arr[i],0l);
		}
		
		ArrayList<Integer> al = new ArrayList<>(hm.keySet());
		long total =0;
		int len = al.size();
		for(int i=0;i<len;i++){
			int val = al.get(i);
			long oc = occ[val];
			long temp = ((oc)*(oc-1))/2;
			hm.put(val,temp);
			total+=temp;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++){
			int val = arr[i];
			long gh =total-(occ[val]-1);
			sb.append(gh+"\n");
		}
		System.out.print(sb.toString());
	}
}