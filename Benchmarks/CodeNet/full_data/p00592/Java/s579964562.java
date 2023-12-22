import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Remote;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		(new Main()).commercial();
	}

	ArrayList<Integer[]> intervalArray;

	void commercial(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = new String();
			while((str = br.readLine()) != null){
				String strs[] = str.split(" ");
				int n = Integer.parseInt(strs[0]);
				if(n == 0) return;

				int start_minute = stringTimeToMinute(strs[1]);
				int end_minute = stringTimeToMinute(strs[2]);

				//System.out.println("Channel: " + n + "\t Start: " + start_minute + "\t End:" + end_minute);

				intervalArray = new ArrayList<Integer[]>();

				for(int i = 0; i < n; i++){
					int k = Integer.parseInt(br.readLine());

					str = br.readLine();
					strs = str.split(" ");

					Integer interval[] = new Integer[2];
					interval[0] = start_minute;

					for(int j = 0; j < k; j++){
						interval[1] = stringTimeToMinute(strs[2 * j]);
						// printArray(interval);
						//intervalArray.add(interval);
						addInterval(interval);
						interval = new Integer[2];
						interval[0] = stringTimeToMinute(strs[2 * j + 1]);
					}
					interval[1] = end_minute;
					// printArray(interval);
					//intervalArray.add(interval);
					addInterval(interval);
				}
				//printArray(intervalArray);

				int max_interval = 0;
				for(int i = 0; i < intervalArray.size(); i++){
					Integer targetInterval[] = intervalArray.get(i);
					int interval_minute = targetInterval[1] - targetInterval[0];
					if(max_interval < interval_minute) max_interval = interval_minute;
				}
				System.out.println(max_interval);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	void addInterval(Integer newInterval[]){
		ArrayList<Integer[]> removeArray = new ArrayList<Integer[]>();

		for(int i = 0; i < intervalArray.size(); i++){
			Integer targetInterval[] = intervalArray.get(i);
			if(newInterval[1] < targetInterval[0]){
				continue;
			}else if(targetInterval[1] < newInterval[0]){
				continue;
			}else{
				newInterval[0] = Math.min(newInterval[0], targetInterval[0]);
				newInterval[1] = Math.max(newInterval[1], targetInterval[1]);
				removeArray.add(targetInterval);
			}
		}
		intervalArray.removeAll(removeArray);
		intervalArray.add(newInterval);
	}

	int stringTimeToMinute(String input_str){
		int input_int = Integer.parseInt(input_str);
		int hour_part = input_int / 100;
		int minute_part = input_int % 100;
		int result = hour_part * 60 + minute_part;
		return result;
	}

	void printArray(ArrayList<Integer[]> array){
		for(int i = 0; i < array.size(); i++){
			printArray(array.get(i));
		}
	}

	static void printArray(Integer array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println("");
	}
}