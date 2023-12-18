package com.lxr.sds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) throws Exception {
		/*BufferedReader br = new BufferedReader(
				new InputStreamReader(Main.class.getResourceAsStream("/com/lxr/sds/test.data")));*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		int provinceCount = Integer.parseInt(systemInLine[0]);
		int cityCount = Integer.parseInt(systemInLine[1]);
		pf("辖区总数:" + provinceCount + " 城市总数:" + cityCount);

		/**
		 * 辖区城市关系表 key 辖区编号 value 辖区对应的城市创建年份
		 */
		Map<Integer, Set<Integer>> provinceCityMap = new HashMap<>();

		/**
		 * 所有的城市
		 */
		List<City> cityList = new ArrayList<>(cityCount);

		for (int i = 0; i < cityCount; i++) {
			systemInLine = br.readLine().split(" ");
			int provinceIndex = Integer.parseInt(systemInLine[0]);
			int cityCreateYear = Integer.parseInt(systemInLine[1]);

			City city = new City(i + 1, provinceIndex, cityCreateYear);
			cityList.add(city);

			if (!provinceCityMap.containsKey(provinceIndex)) {
				Set<Integer> list = new TreeSet<>();
				provinceCityMap.put(provinceIndex, list);
			}
			provinceCityMap.get(provinceIndex).add(cityCreateYear);
		}
		br.close();
		// pf("辖区城市对应关系：" + provinceCityMap);

		pf("排序前结果:" + provinceCityMap);
		Map<Integer, Integer> yearNoMap = new HashMap<>();
		for (Map.Entry<Integer, Set<Integer>> provinceCityYears : provinceCityMap.entrySet()) {
			Set<Integer> arr = provinceCityYears.getValue();
			Iterator<Integer> it = arr.iterator();
			int index = 1;
			while (it.hasNext()) {
				yearNoMap.put(it.next(), index);
				index++;
			}
		}

		for (City city : cityList) {
			int year = city.getYear();
			// 读取会耗时!!!!!!!!!!
			String yearNo = String.format("%06d", yearNoMap.get(year));

			// .................................//
			System.out.println(city.getProvinceNo() + yearNo);
			yearNoMap.remove(year);
		}
	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}
}

class City {
	// 序号
	private int seq;
	// 辖区编号
	private String provinceNo;
	// 辖区
	private int province;
	// 创建日期
	private int year;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getProvinceNo() {
		return provinceNo;
	}

	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 
	 * @param seq
	 *            序号
	 * @param province
	 *            辖区
	 * @param year
	 *            创建日期
	 */
	public City(int seq, int province, int year) {
		super();
		this.seq = seq;
		this.province = province;
		this.year = year;
		this.provinceNo = String.format("%06d", province);
	}

	@Override
	public String toString() {
		return "City [seq=" + seq + ", provinceNo=" + provinceNo + ", province=" + province + ", year=" + year + "]";
	}

}