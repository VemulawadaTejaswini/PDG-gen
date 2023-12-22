import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	int n = Integer.valueOf(sc.readLine());
	TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
	TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
	TreeMap<String, Integer> map3 = new TreeMap<String, Integer>();
	TreeMap<String, Integer> map4 = new TreeMap<String, Integer>();
	TreeMap<String, Integer> map5 = new TreeMap<String, Integer>();
	for(int i=0; i<n; i++){
		String[] st = sc.readLine().split(" ");
		int num = Integer.valueOf(st[1]);
		if(st[0].length()==1){
			if(map1.containsKey(st[0])){
				num += map1.get(st[0]);
				map1.remove(st[0]);
				}
			map1.put(st[0],num);}
		else if(st[0].length()==2){
			if(map2.containsKey(st[0])){
				num += map2.get(st[0]);
				map2.remove(st[0]);
				}
			map2.put(st[0],num);}
		else if(st[0].length()==3){
			if(map3.containsKey(st[0])){
				num += map3.get(st[0]);
				map3.remove(st[0]);
				}
			map3.put(st[0],num);}
		else if(st[0].length()==4){
			if(map4.containsKey(st[0])){
				num += map4.get(st[0]);
				map4.remove(st[0]);
				}
			map4.put(st[0],num);}
		else if(st[0].length()==5){
			if(map5.containsKey(st[0])){
				num += map5.get(st[0]);
				map5.remove(st[0]);
				}
			map5.put(st[0],num);}
		}

	for (Map.Entry<String, Integer>	entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	for (Map.Entry<String, Integer>	entry : map2.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	for (Map.Entry<String, Integer>	entry : map3.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	for (Map.Entry<String, Integer>	entry : map4.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	for (Map.Entry<String, Integer>	entry : map5.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}