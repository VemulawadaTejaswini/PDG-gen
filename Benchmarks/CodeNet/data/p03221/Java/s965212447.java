import java.util.*;
import java.io.*;

class Pair<E,F>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }
}
class City implements Comparable<City>{
	int year;
	int pref;
	int totalID;
	public City(int year, int pref, int totalID){
		this.year = year;
		this.pref = pref;
		this.totalID = totalID;
	}
	public int getYear(){return year;}
	public int getPref(){return pref;}
	public int getTotalID(){return totalID;}
	public int compareTo(City another){
		if(this.getYear()==another.getYear()) return this.getPref()-another.getPref();
		else return this.getYear() - another.getYear();
	}
	
	public String toString(){
		return "<year:"+year+", pref:"+pref+">";	}
}

public class Main {
    public static String to6digit(String s){
    	while(s.length()<6) s="0"+s;
    	return s;
    }
    public static String to6digit(int n){
    	return to6digit(Integer.toString(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        City[] allCity = new City[M];
        for(int m=0;m<M;m++){
        	int p = sc.nextInt();
        	int y = sc.nextInt();
        	allCity[m] = new City(y, p, m);
        }
        Arrays.sort(allCity);
        
        //System.out.println(Arrays.toString(allCity));
        
        
        int[] oldCityNum = new int[N+1];
        Arrays.fill(oldCityNum,0);
        String[] ans = new String[M];
        for(int m=0;m<M;m++){
        	City c = allCity[m];
        	int pref = c.getPref();
        	
        	ans[c.getTotalID()] = to6digit(pref) + to6digit(1+oldCityNum[pref]);
        	oldCityNum[pref]++;
        }
        for(int m=0;m<M;m++) System.out.println(ans[m]);
    }
}