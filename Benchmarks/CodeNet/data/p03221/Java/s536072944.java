import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int N;
	static int M;
	static int[][] DATA;
	static List<?>[] prefectures;
	static Queue<?>[] preQueue;
	public static void main(String[] args) throws Exception {
//		long startTime = System.currentTimeMillis();
//        String url = Main.class.getResource("").getPath();
//        System.setIn(new FileInputStream(url + "ID.txt"));
 
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufReader.readLine();
        String[] lineArr = line.split(" ");
        N = Integer.parseInt(lineArr[0]);
        M = Integer.parseInt(lineArr[1]);
        
        DATA = new int[M][2];
        prefectures = new ArrayList<?>[N+1];
        preQueue = new LinkedList<?>[N+1];
        for (int i=0; i<M; i++){
        	line = bufReader.readLine();
        	lineArr = line.split(" ");
        	int prefecture = Integer.parseInt(lineArr[0]);
        	int year = Integer.parseInt(lineArr[1]);
        	DATA[i][0] = prefecture;
        	DATA[i][1] = year;
        	
        	City city = new City(year);
        	if (null == prefectures[prefecture]){
        		List<City> prefectureGroup = new ArrayList<City>();
        		city.setIndex(1);
        		prefectureGroup.add(city);
        		
        		prefectures[prefecture] = prefectureGroup;
        		
        		LinkedList<City> preQueueGroup = new LinkedList<City>();
        		preQueueGroup.add(city);
        		preQueue[prefecture] = preQueueGroup;
        	}
        	else{
        		List<City> prefectureGroup = (List<City>)prefectures[prefecture];
        		city.setIndex(prefectureGroup.size() + 1);
        		prefectureGroup.add(city);
        		
        		LinkedList<City> preQueueGroup = (LinkedList<City>)preQueue[prefecture];
        		preQueueGroup.add(city);
        	}
        }
        
        for (int i=1; i<=N; i++){
        	ArrayList<City> prefectureGroup = (ArrayList)prefectures[i];
        	if (null != prefectureGroup){
        		Collections.sort(prefectureGroup);
        		for (int j=0; j<prefectureGroup.size(); j++){
        			prefectureGroup.get(j).setIndex(j+1);
        		}
        	}
        }
        for (int i=0; i<M; i++){
        	int prefecture = DATA[i][0];
        	City city = (City)preQueue[prefecture].poll();
        	int index = city.getIndex();
        	System.out.println(conStructId(prefecture) + conStructId(index));
        }
        
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
	}
	
	static String conStructId(int number){
		String result = "";
		int length = 6 - (number+"").length();
		for (int i=0; i<length; i++){
			result += "0";
		}
		return result + number;
	}
	
	static class City implements Comparable<City>{
		private int index;
		private int year;
		public City(int year){
			this.year = year;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
		@Override
		public int compareTo(City o) {
			// TODO Auto-generated method stub
			int result = 0;			
			if (o.year < this.year){
				result = 1;
			}
			else if (o.year > this.year){
				result = -1;
			}
			else{
				result = 0;
			}
			return result;
		}
	}
}