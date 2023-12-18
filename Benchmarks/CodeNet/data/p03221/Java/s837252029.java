

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		int provinceCount = Integer.parseInt(systemInLine[0]);
		int cityCount = Integer.parseInt(systemInLine[1]);
		pf("辖区总数:" + provinceCount + " 城市总数:" + cityCount);

		
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

		}
		br.close();
		
		/**
		 * 这次排序后辖区和年份已经排序了
		 */
		pf("排序前结果1:" + cityList);
		
		Collections.sort(cityList, new Comparator<City>() {
			@Override
			public int compare(City c1, City c2) {
				if(c1.getProvince()==c2.getProvince()) {
					return c1.getYear()-c2.getYear();
				}
				return c1.getProvince() - c2.getProvince();
			}
		});
		
		
		// pf("辖区城市对应关系：" + provinceCityMap);

		pf("排序后结果1:" + cityList);
		
		/**
		 * 设置头部的年份序号
		 */
		int seq = 1;
		cityList.get(0).setYearIndexNo(seq);
		for (int i = 1; i < cityList.size(); i++) {
			if(cityList.get(i).getProvince()==cityList.get(i-1).getProvince()) {//根上一个省份比较
				cityList.get(i).setYearIndexNo(cityList.get(i-1).getYearIndexNo()+1);
			}else {
				cityList.get(i).setYearIndexNo(1);
			}
		}
		
		Collections.sort(cityList, new Comparator<City>() {
			@Override
			public int compare(City c1, City c2) {
				return c1.getSeq()-c2.getSeq();
			}
		});
		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(cityList.get(i).getProvinceNo()+String.format("%06d", cityList.get(i).getYearIndexNo()));
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
	// 创建日期
	private int yearIndexNo;

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
	public void setYearIndexNo(int yearIndexNo) {
		this.yearIndexNo = yearIndexNo;
	}
	public int getYearIndexNo() {
		return yearIndexNo;
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