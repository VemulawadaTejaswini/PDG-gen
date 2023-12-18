import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        List<City> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	list.add(new City(i, scan.nextInt(), scan.nextInt()));
        }
        list = list.stream().sorted(new Comparator<City>() {
        	public int compare(City c1, City c2) {
        		return c1.prefecture.compareTo(c2.prefecture);
        	}
        }).collect(Collectors.toList());

        list = list.stream().sorted(new Comparator<City>() {
        	public int compare(City c1, City c2) {
        		return c1.year.compareTo(c2.year);
        	}
        }).collect(Collectors.toList());

        int wkPrefecture = list.get(0).prefecture;
        int wkId = 1;
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i).prefecture == wkPrefecture) {
        		list.get(i).ID = String.format("%06d", list.get(i).prefecture) + String.format("%06d", wkId);
        		wkId++;
        	}else {
        		wkId = 1;
        		wkPrefecture = list.get(i).prefecture;
        		list.get(i).ID = String.format("%06d", list.get(i).prefecture) + String.format("%06d", wkId);
        	}
        }
        list = list.stream().sorted(new Comparator<City>() {
        	public int compare(City c1, City c2) {
        		return c1.index.compareTo(c2.index);
        	}
        }).collect(Collectors.toList());

        for(int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i).ID);
        }
    }
}

class City {
	Integer index;
	Integer prefecture;
	Integer year;
	String ID = "";
	City(int index, int prefecture, int year){
		this.index = index;
		this.prefecture = prefecture;
		this.year = year;
	}
}