import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		int i;
		int C, S, F;

		Tuple(int i, String[] tokens) {
			this.i = i;
			this.C = Integer.parseInt(tokens[0]);
			this.S = Integer.parseInt(tokens[1]);
			this.F = Integer.parseInt(tokens[2]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		Tuple[] stations = new Tuple[N - 1];
		for (int i = 0; i + 1 < N; ++i) {
			stations[i] = new Tuple(i, in.readLine().split(" "));
		}
		for (int i = 0; i + 1 < N; ++i) {
			System.out.println(getArriveTime(stations, i));
		}
		System.out.println(0);

	}

	static long getArriveTime(Tuple[] stations, int startStation) {
		long time = 0;
		for (int i = startStation; i < stations.length; ++i) {
			Tuple station = stations[i];
			if (time < station.S) {
				time = station.S;
			} else if (time % station.F != 0) {
				time += station.F - (time % station.F);
			}
			time += station.C;
		}

		return time;
	}
}