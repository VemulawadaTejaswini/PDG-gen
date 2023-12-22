import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			List<syain> list = new ArrayList<syain>();
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			int cnt = 0;
			for(int s=0;s<n;s++){
				int ban = in.nextInt();
				if(!map.containsKey(ban)){
					list.add(new syain(ban));
					map.put(ban,cnt);
					cnt++;
				}
				list.get(map.get(ban)).plus(in.nextLong()*in.nextLong());
			}
			boolean sw = false;
			for(int i=0;i<list.size();i++)if(list.get(i).kin>=1000000){
				System.out.println(list.get(i).ban);
				sw=true;
			}
			if(!sw)System.out.println("NA");
		}
	}
}
class syain implements Comparable<syain>{
	int ban;
	long  kin;
	syain(int ban){
		this.ban=ban;
		kin=0;
	}
	public void plus(long kin){
		this.kin+=kin;
	}
	public int compareTo(syain o) {
		return 0;
	}
}