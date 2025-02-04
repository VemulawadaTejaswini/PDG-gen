import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Movie[] movies = new Movie[n];
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			movies[i] = new Movie(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
		}

		Arrays.sort(movies);

		int first = 0;
		int date = 0;
		for(int i = 0; i < n ;i++){
//			int tmpDate = movies[i].start;

			for(int j = movies[i].start ; j <= movies[i].end ; j++){
				if(j > date){
					first++;
					date = j;
					break;
				}
			}
		}

		System.out.println(50*31 + 50*first);
	}

}

class Movie implements Comparable<Movie>{
	int start;
	int end;
	int interval;

	public Movie(int s, int e){
		this.start = s;
		this.end = e;
		this.interval = e - s + 1;
	}

	@Override
	public int compareTo(Movie m) {
		// TODO ?????????????????????????????????????????????
		return this.start == m.start ? (this.interval == m.interval ? 0 : this.interval - m.interval) : this.start - m.start;
	}


}