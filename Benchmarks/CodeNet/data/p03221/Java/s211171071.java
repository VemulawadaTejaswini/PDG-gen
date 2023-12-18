import java.util.*;
import java.io.*;

//街を表すクラスを定義しておくとはかどります
//成立年順でソートしたいので, そのように順序付けしておくと better
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
    //整数を6桁で表す変換
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
        //M個の市について情報を入力
        for(int m=0;m<M;m++){
        	int p = sc.nextInt();
        	int y = sc.nextInt();
        	allCity[m] = new City(y, p, m);
        }
        Arrays.sort(allCity);
        
        int[] oldCityNum = new int[N+1];//これまでに確認されたn県の市.
        //oldCityNum[N]を使いたいのでindexを余分にとった. [0]は使わない
        
        Arrays.fill(oldCityNum,0); //とりああえず0で初期化.
        String[] ans = new String[M];
        for(int m=0;m<M;m++){ //市を古い方から確認していく
        	City c = allCity[m];
        	int pref = c.getPref();
        	//"何県にあるか"と"同じ県でここより古い市の数"が分かるので,認識番号を求められる
        	ans[c.getTotalID()] = to6digit(pref) + to6digit(1+oldCityNum[pref]);
        	oldCityNum[pref]++;
        }
        for(int m=0;m<M;m++) System.out.println(ans[m]);
    }
}
