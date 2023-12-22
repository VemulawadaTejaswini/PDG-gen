import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main{

	public static int cut(int n){
		return n%2==0?n/2-1:n/2;
	}

	public static List<Integer> copy(List<Integer> list){
		List<Integer> r = new LinkedList<Integer>();
		for(int i : list)r.add(i);
		return r;
	}

	public static int minFormer(List<Integer> list){
		int cut = cut(list.size());
		int min = list.get(0);
		for(int i=1;i<=cut;i++)min=Math.min(min, list.get(i));
		return min;
	}

	public static int maxFormer(List<Integer> list){
		int cut = cut(list.size());
		int max = list.get(0);
		for(int i=1;i<=cut;i++)max=Math.max(max, list.get(i));
		return max;
	}

	public static int minLator(List<Integer> list){
		int cut = cut(list.size());
		if(cut+1>=list.size())return Integer.MAX_VALUE;
		int min = list.get(cut+1);
		for(int i=cut+2;i<list.size();i++)min= Math.min(min, list.get(i));
		return min;
	}

	public static int maxLator(List<Integer> list){
		int cut = cut(list.size());
		if(cut+1>=list.size())return Integer.MIN_VALUE;
		int max = list.get(cut+1);
		for(int i=cut+2;i<list.size();i++)max= Math.max(max, list.get(i));
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int q = sc.nextInt();
			if(q==0)break;
			List<Integer> list = new LinkedList<Integer>();
			while(q--!=0){
				int cmd = sc.nextInt();
				if(cmd==0){
					list.add(sc.nextInt());
				}
				else if(cmd==1){
					int cut=cut(list.size());
					System.out.println(list.remove(cut));
				}
				else if(cmd==2){
					System.out.println(minFormer(list));
				}
				else if(cmd==3){
					System.out.println(minLator(list));
				}
				else if(cmd==4){
					int i = sc.nextInt();
					SortedSet<Integer> r = new TreeSet<Integer>();
					Set<Integer> set = new HashSet<Integer>();
					int cut = cut(list.size());
					for(int j=0;j<=cut;j++)set.add(list.get(j));
					List<Integer> f = copy(list);
					while(!f.isEmpty()){
						int min = minFormer(f);
						if(set.contains(min))r.add(min);
						f.remove(cut(f.size()));
					}
					int j=1;
					while(j<i){
						j++;
						r.remove(r.first());
					}
					System.out.println(r.first());
				}
				else if(cmd==5){
					int i = sc.nextInt();
					SortedSet<Integer> r = new TreeSet<Integer>();
					Set<Integer> set = new HashSet<Integer>();
					int cut = cut(list.size());
					for(int j=cut+1;j<list.size();j++)set.add(list.get(j));
					List<Integer> f = copy(list);
					while(!f.isEmpty()){
						int min = minLator(f);
						if(set.contains(min))r.add(min);
						f.remove(cut(f.size()));
					}
					int j=1;
					while(j<i){
						j++;
						r.remove(r.first());
					}
					System.out.println(r.first());
				}
				else if(cmd==6){
					System.out.println(maxFormer(list));
				}
				else if(cmd==7){
					System.out.println(maxLator(list));
				}
				else if(cmd==8){
					int i = sc.nextInt();
					SortedSet<Integer> r = new TreeSet<Integer>();
					Set<Integer> set = new HashSet<Integer>();
					int cut = cut(list.size());
					for(int j=0;j<=cut;j++)set.add(list.get(j));
					List<Integer> f = copy(list);
					while(!f.isEmpty()){
						int max = maxFormer(f);
						if(set.contains(max))r.add(max);
						f.remove(cut(f.size()));
					}
					int j=1;
					while(j<i){
						j++;
						r.remove(r.last());
					}
					System.out.println(r.last());
				}
				else if(cmd==9){
					int i = sc.nextInt();
					SortedSet<Integer> r = new TreeSet<Integer>();
					Set<Integer> set = new HashSet<Integer>();
					int cut = cut(list.size());
					for(int j=cut+1;j<list.size();j++)set.add(list.get(j));
					List<Integer> f = copy(list);
					while(!f.isEmpty()){
						int max = maxLator(f);
						if(set.contains(max))r.add(max);
						f.remove(cut(f.size()));
					}
					int j=1;
					while(j<i){
						j++;
						r.remove(r.last());
					}
					System.out.println(r.last());
				}
			}
			System.out.println("end");
		}
	}
}