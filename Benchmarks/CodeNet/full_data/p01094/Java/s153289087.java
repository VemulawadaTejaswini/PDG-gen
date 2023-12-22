import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int l){
		return IntStream.range(0,l);
	}
	public static void main(String[] __){
		HashMap<Character,Integer> hm=new HashMap<>(26);
		while(true){
			hm.clear();
			boolean f=false;
			int n=getInt();
			if(n==0) return;
			for(int i=n-1;i>=0;i--){
				if(!f){
					hm.merge(
							s.next().charAt(0),
							1,
							Integer::sum);
					List<Entry<Character,Integer>> hoge=hm.entrySet().stream()
							.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
							.limit(2)
							.collect(Collectors.toList());
					Entry<Character,Integer> e=hoge.get(0);
					if((hoge.size()==1&&e.getValue()>i)||
							(hoge.size()>1&&e.getValue()>hoge.get(1).getValue()+i)){
						System.out.println(e.getKey()+" "+(n-i));
						f=true;
					}
				}else{
					s.next();
				}
			}
			if(!f){
				System.out.println("TIE");
			}
		}
	}
}