package com.lxr.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static boolean pf = false;

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int xqsl = sc.nextInt();
		int ctcount = sc.nextInt();
		pf("辖区总数:" + xqsl);
		pf("城市总数:" + ctcount);
		Map<Integer, List<Integer>> xscs = new HashMap<>(); 
		List<City> cityList = new ArrayList<>();
		for (int i = 0; i < ctcount; i++) {
			int xqindex = sc.nextInt();
			int ctyear = sc.nextInt();
			cityList.add(new City(xqindex, ctyear));
			if(xscs.containsKey(xqindex)) {
				xscs.get(xqindex).add(ctyear);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(ctyear);
				xscs.put(xqindex,list);
				
				
			}
			String xqNo = String.format("%06d" , xqindex);
			pf("第"+(i+1)+"个城市隶属于辖区:" + xqindex+",该辖区编号:"+xqNo);
			pf("第"+(i+1)+"个城市创建于:" + ctyear);
		}
		
		pf("排序前结果:" + xscs);
		for (Map.Entry<Integer, List<Integer>> entry : xscs.entrySet()) { 
			Collections.sort(entry.getValue());
			pf("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		pf("排序后结果:" + xscs);
		sc.close();
		for (City city : cityList) {
			int xq = city.getXq();
			int year = city.getYear();
			List<Integer> yearpx = xscs.get(xq);
			String xqNo = String.format("%06d" , xq);
			int cyNo = yearpx.indexOf(year);
			String yearNo = String.format("%06d" , cyNo+1);
			pf(city+":"+xqNo+yearNo);
			System.out.println(xqNo+yearNo);
		}
	}

	public static void pf(String s) {
		if (pf) {
			System.out.println(s);
		}
	}
	
}
class City{
	private int xq;
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
	public City(int xq, int year) {
		super();
		this.xq = xq;
		this.year = year;
	}
	@Override
	public String toString() {
		return "City [xq=" + xq + ", year=" + year + "]";
	}
	
}