

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int xqsl = sc.nextInt();
		int ctcount = sc.nextInt();
		pf("辖区总数:" + xqsl);
		pf("城市总数:" + ctcount);
		
		/**
		 * 纪录每个辖区城市的创建年份
		 * key 辖区编号
		 * value 年份  (key年 value 序号)
		 */
		Map<Integer, Map<Integer,Integer>> xqMap = new HashMap<>(); 
		
		
		/**
		 * 所有的城市
		 */
		List<City> cityList = new ArrayList<>(ctcount);
		
		for (int i = 0; i < ctcount; i++) {
			int xqindex = sc.nextInt();
			int ctyear = sc.nextInt();
			
			City city = new City(i+1,xqindex, ctyear);
			cityList.add(city);
			
			if(xqMap.containsKey(xqindex)) {
				Map<Integer,Integer> yearMap = xqMap.get(xqindex);
				int no = yearMap.size()+1;
				yearMap.put(ctyear, no);
			}else {
				Map<Integer,Integer> yearMap = new TreeMap<>();
				yearMap.put(ctyear, 1);
				xqMap.put(xqindex,yearMap);
			}
		}
		pf("纪录每个辖区城市的创建年份:" + xqMap);
		sc.close();
		List<Integer> yearNoList = new  ArrayList<>();
		for (City city : cityList) {
			int year = city.getYear();
			yearNoList.clear(); 
			yearNoList.addAll(xqMap.get(city.getXq()).keySet());
			int no =  yearNoList.indexOf(year)+1;
		
			String yearNo = String.format("%06d" , no);
			pf(city+":"+city.getXqNo()+yearNo);
			//.................................//
			System.out.println(city.getXqNo()+yearNo);
		}
	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}
	
}
class ListPx implements Runnable{
	private List<Integer> cityYearList;
	private CountDownLatch latch;
	
	
	public ListPx(List<Integer> cityYearList, CountDownLatch latch) {
		super();
		this.cityYearList = cityYearList;
		this.latch = latch;
	}


	@Override
	public void run() {
		Collections.sort(cityYearList);
		latch.countDown();
	}
	
}
class City{
	private int seq;
	private int xq;
	private String xqNo;
	private int year;
	
	public int getXq() {
		return xq;
	}
	public void setXq(int xq) {
		this.xq = xq;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public City(int seq,int xq, int year) {
		super();
		this.seq = seq;
		this.xq = xq;
		this.year = year;
		this.xqNo = String.format("%06d" , xq);
	}
	public void setXqNo(String xqNo) {
		this.xqNo = xqNo;
	}
	public String getXqNo() {
		return xqNo;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getSeq() {
		return seq;
	}
	@Override
	public String toString() {
		return "City [xq=" + xq + ", year=" + year + "]";
	}
	
}