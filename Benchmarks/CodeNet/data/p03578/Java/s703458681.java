import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	MapUtilStringInt D=new MapUtilStringInt();

    	D.receiveKeys(N, sc);

    	int M=sc.nextInt();

    	MapUtilStringInt T=new MapUtilStringInt();

    	T.receiveKeys(M, sc);

    	for(String key:T.data.keySet()) {

    		if(T.data.get(key)<D.data.get(key)) {
    			System.out.println("NO");
    		}
    	}

    	System.out.println("YES");


    }

}

class MapUtilStringInt {

	public  Map<String,Integer> data;


	public MapUtilStringInt() {

		data=new HashMap<String,Integer>();

	}


	public void receiveDataSet(int n,Scanner sc) {

		for(int i=0;i<n;i++) {
			String bufK=sc.next();
			Integer bufV=sc.nextInt();

			putWithCheckAndAdd(bufK,bufV);
		}

	}

	public void addValue(String key,int val) {

		if(data.containsKey(key)) {
			data.put(key, data.get(key)+val);
		}else {
			data.put(key, val);
		}

	}

	public void putWithCheckAndAdd(String key,Integer Value) {


		if(data.containsKey(key)) {
			data.put(key, data.get(key)+Value);
		}else {
			data.put(key, 1);
		}

	}


	public void receiveKeys(String s) {

		String[] buf=s.split("");

		for(int i=0;i<buf.length;i++) {

			putWithCheckAndIncrement(buf[i]);
		}

	}

	public void receiveKeys(int n,Scanner sc) {

		for(int i=0;i<n;i++) {
			String bufK=sc.next();

			putWithCheckAndIncrement(bufK);
		}

	}



	public void putWithCheckAndIncrement(String key) {


		if(data.containsKey(key)) {
			data.put(key, data.get(key)+1);
		}else {
			data.put(key, 1);
		}

	}

	public Integer getValue(String key) {
		return data.get(key);
	}

	public List<Integer> getValuesAscKey() {

		List<Integer> result=new ArrayList<Integer>();
		// キーでソートする
        Object[] mapkey = data.keySet().toArray();
        Arrays.sort(mapkey);

        for (Object nKey : mapkey)
        {
            result.add(data.get(nKey));
        }

        return result;
	}

	public List<Integer> getValuesDscKey() {

		List<Integer> result=new ArrayList<Integer>();
		// キーでソートする
        Object[] mapkey = data.keySet().toArray();
        Arrays.sort(mapkey, Collections.reverseOrder());

        for (Object nKey : mapkey)
        {
            result.add(data.get(nKey));
        }

        return result;
	}

	public Integer getBestN(int n) {

		int result=-1;

		int index=n-1;

		if(index>=0 && index<=data.size()-1) {
			result=sortValuesDsc().get(index).getValue();
		}

		return result;

	}

	public Integer getWorstN(int n) {

		int result=-1;

		int index=n-1;

		if(index>=0 && index<=data.size()-1) {
			result=sortValuesAsc().get(index).getValue();
		}

		return result;

	}

	public List<Entry<String, Integer>> sortValuesAsc() {
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(data.entrySet());

        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }


        });

        return list_entries;
	}

	public List<Entry<String, Integer>> sortValuesDsc() {
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(data.entrySet());

        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }


        });

        return list_entries;
	}


	public void print() {

		for(Entry<String,Integer> entry:data.entrySet()) {

			System.out.println(entry.getKey()+" "+entry.getValue());

		}

	}

	public void printValuesAsc() {

		List<Integer> Values=getValuesAscKey();
		int counter=1;
		for(Integer I:Values) {
    		System.out.print(I);

    		if(counter++==Values.size()) {
    			System.out.println();
    		}else {
    			System.out.print(" ");
    		}
    	}
	}

	public void printlnValuesAsc() {

		List<Integer> Values=getValuesAscKey();
		for(Integer I:Values) {
    		System.out.println(I);
    	}
	}

	public void printValuesDsc() {

		List<Integer> Values=getValuesDscKey();
		int counter=1;
		for(Integer I:Values) {
    		System.out.print(I);

    		if(counter++==Values.size()) {
    			System.out.println();
    		}else {
    			System.out.print(" ");
    		}
    	}
	}

	public void printlnValuesDsc() {

		List<Integer> Values=getValuesDscKey();
		for(Integer I:Values) {
    		System.out.println(I);
    	}
	}


	public void printdataValueSortedDsc() {
		for(Entry<String, Integer> entry:sortValuesDsc()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public void printdataValueSortedAsc() {
		for(Entry<String, Integer> entry:sortValuesAsc()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}




}


