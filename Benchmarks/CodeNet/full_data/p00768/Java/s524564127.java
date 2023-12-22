import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static int m,t,p,r;
	static class Team{
		int wa[],time=0,id,ac;
		Team(int ID){
			id=ID;
			wa=new int[p];
		}
		int getId(){
			return id;
		}
		int getTime(){
			return time;
		}
		int getAc(){
			return ac;
		}
		Integer getRank(){
			return ac*10000000-time;
		}
	}
	public static void main(String[] __){
		while(true){
			m=getInt();
			if(m==0) return;
			t=getInt();
			p=getInt();
			r=getInt();
			
			Team[] teams=IntStream.rangeClosed(1,t).mapToObj(Team::new).toArray(Team[]::new);
			for(int i=0;i<r;i++){
				int m=getInt(),t=getInt(),p=getInt(),j=getInt();
				final Team team=teams[t-1];
				switch(j){
				case 0:
					team.time+=m+team.wa[p-1]*20;
					team.ac++;
					break;
				default:
					team.wa[p-1]++;
					break;
				}
			}
			TreeMap<Integer,TreeSet<Integer>> v=Arrays.stream(teams)
					.collect(Collectors.groupingBy(
							Team::getRank,
							()->new TreeMap<>(Comparator.<Integer> reverseOrder()),
							Collectors.mapping(Team::getId,Collectors.toCollection(
									()->new TreeSet<>(Comparator.<Integer> reverseOrder())))));
			System.out.println(
					v.entrySet().stream().map(
							o->o.getValue().stream()
									.map(Object::toString)
									.collect(Collectors.joining("=")))
							.collect(Collectors.joining(",")));
		}
	}
}