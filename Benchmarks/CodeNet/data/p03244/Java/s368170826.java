import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	Map<Integer, Integer> a = new HashMap<Integer, Integer>();
    	Map<Integer, Integer> b = new HashMap<Integer, Integer>();
    	int n=sc.nextInt();
    	for(int i=0;i<n/2;i++) {
    		int v=sc.nextInt();
    		if(a.containsKey(v))a.put(v, a.get(v)+1);
    		else a.put(v, 1);
    		v=sc.nextInt();
    		if(b.containsKey(v))b.put(v, b.get(v)+1);
    		else b.put(v, 1);
    	}
        //Map.Entry
        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(b.entrySet());
        List<Entry<Integer, Integer>> list_entries2 = new ArrayList<Entry<Integer, Integer>>(a.entrySet());
        //Comparator(昇順)
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
            	//昇順 return obj1.getValue().compareTo(obj2.getValue());
                 return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        Collections.sort(list_entries2, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
            	//昇順 return obj1.getValue().compareTo(obj2.getValue());
                 return obj2.getValue().compareTo(obj1.getValue());
            }
        });
int ans=0;int number_a=0;
        for(Entry<Integer, Integer> entry : list_entries) {
           number_a=entry.getKey();
           ans+=n/2-entry.getValue();
           break;
        }
int ans2=0; int number_b=0;
        for(Entry<Integer, Integer> entry : list_entries2) {
            number_b=entry.getKey();
            ans2+=n/2-entry.getValue();
            break;
         }
        if(ans==0&&ans2==0&&number_a==number_b)System.out.println(n/2);
        else if(number_a!=number_b) System.out.println(ans+ans2);
        else {
        	int exans=0;int count=0;
            for(Entry<Integer, Integer> entry : list_entries) {
                if(count ==1) {
                	//number_a=entry.getKey();
                    exans+=n/2-entry.getValue();
                    break;
                }
                	count++;
             }
            int exans2=0;count=0;
            for(Entry<Integer, Integer> entry : list_entries2) {
                if(count ==1) {
                	//number_a=entry.getKey();
                    exans2+=n/2-entry.getValue();
                    break;
                }
                	count++;
             }
            System.out.println(Math.min(exans+ans2,ans+exans2));

        }
    }

}