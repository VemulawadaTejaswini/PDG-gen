import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	static int PRE, CITY;
	private static LinkedList<CityInfo> linkList = new LinkedList<CityInfo>();
	public static void main (String args[]) throws Exception{
	            Scanner sc = new Scanner(System.in);
	            PRE=sc.nextInt();
	            CITY=sc.nextInt();
	            PriorityQueue<CityInfo> queue=new PriorityQueue<CityInfo>(CITY,new CityComparator());
	            for(int i=0;i<CITY;i++){
	            	CityInfo city=new CityInfo();
	            	int a = sc.nextInt();
	            	int b = sc.nextInt();
	            	city.setCityNum(b);
	            	city.setPreNum(a);
	            	linkList.add(city);
	            	map.put(a, 0);
	            	queue.add(city);
	            }
	            sc.close();
	            CityInfo.setOtherCityInfo(queue);
	            for(CityInfo city:linkList){
	            	System.out.println(city.getOutPreNumber()+city.getOutCityNumber());
	            }
 
	        }
	public static int getCityOrderInPre(CityInfo city){
		Integer preNum = map.get(city.getPreNum())+1;
		map.put(city.getPreNum(), preNum);
		return preNum;
	}
	public static class CityInfo{
		private int preNum;
		private int cityNum;
		String outCityNumber;
		String outPreNumber;
		public CityInfo() {
			super();
		}
		public String getOutCityNumber() {
			return outCityNumber;
		}
		public void setOutCityNumber(String outCityNumber) {
			this.outCityNumber = outCityNumber;
		}
		public String getOutPreNumber() {
			return outPreNumber;
		}
		public void setOutPreNumber(String outPreNumber) {
			this.outPreNumber = outPreNumber;
		}
		public int getPreNum() {
			return preNum;
		}
		public void setPreNum(int preNum) {
			this.preNum = preNum;
		}
		public int getCityNum() {
			return cityNum;
		}
		public void setCityNum(int cityNum) {
			this.cityNum = cityNum;
		}
      public static void setOtherCityInfo(PriorityQueue<CityInfo> queue){
    	  
    	  for(CityInfo city:queue){
    		  String p = String.format("%6s", city.getPreNum());
          	 String c = String.format("%6s", getCityOrderInPre(city));
               p = p.replaceAll("\\s","0");
               c = c.replaceAll("\\s","0");
               city.setOutCityNumber(c);
               city.setOutPreNumber(p);
    	  }
      }
	}
	
	public static class  CityComparator implements Comparator<CityInfo>{
		public int compare(CityInfo o1, CityInfo o2) {
			if(o1.cityNum>o2.cityNum)
			{
				return 1;
			}else
			{
				return -1;
			}
		}
	}

}