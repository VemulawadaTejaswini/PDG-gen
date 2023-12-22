import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static Scanner s;
	
	static int t,p,r;
	public static void main(String __[]) throws FileNotFoundException {
		s= new Scanner(new File("2400-in1.txt"));
		while(true){
			t=s.nextInt();
			p=s.nextInt();
			r=s.nextInt();
			
			if(t+p+r==0)return;
			
			Team[]teams=IntStream.rangeClosed(1,t).mapToObj(Team::new).toArray(Team[]::new);
			for(int i=0;i<r;i++) {
				int tt=s.nextInt(),pp=s.nextInt(),time=s.nextInt();
				String mes=s.next();
				
				switch(mes){
				case "CORRECT":
					teams[tt-1].pena+=teams[tt-1].wa[pp-1]*1200+time;
					teams[tt-1].solved++;
					break;
				case "WRONG":
					teams[tt-1].wa[pp-1]++;
					break;
				}
			}
			Arrays.stream(teams).sorted(
					Comparator
					.comparingInt(Team::getSolved).reversed()
					.thenComparingInt(Team::getPenalty)
					.thenComparingInt(Team::getID)
					).forEach(System.out::println);
		}
	}
	static class Team{
		int id,pena=0,solved=0,wa[]=new int[p];
		Team(int id){
			this.id=id;
		}
		int getSolved() {
			return solved;
		}
		int getPenalty() {
			return pena;
		}
		int getID() {
			return id;
		}
		@Override
		public String toString(){
			return id+" "+solved+" "+pena;
		}
	}
}