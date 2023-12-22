import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int			eventCountMax = 0;
		int 		outCount 	= 0;
		int			point		= 0;

		boolean[] 	bases = new boolean[]{false, false, false};

		List<Integer> list = new ArrayList<Integer>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		eventCountMax = Integer.parseInt(reader.readLine());


		for(int i = 0; i < eventCountMax; i++){

			while(outCount != 3){
				String command = reader.readLine();

				if(command.equals("HIT")){
					if	(bases[2]){ point++; 		 bases[2] = false;}
					if	(bases[1]){ bases[2] = true; bases[1] = false;}
					if	(bases[0]){ bases[1] = true; bases[0] = false;}

					bases[0] = true;
				}else if(command.equals("HOMERUN")){
					for(boolean flag : bases) if(flag) point++;
					point++;
				}else if(command.equals("OUT")){
					outCount++;
				}
			}

			list.add(point);
			point = 0;
			bases = new boolean[]{false, false, false};
			outCount=0;
		}

		for(int score : list) System.out.println(score);
	}

}