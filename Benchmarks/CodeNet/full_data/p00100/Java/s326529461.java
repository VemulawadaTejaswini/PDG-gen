import java.util.*;
import java.util.Map.Entry;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			LinkedHashMap<Integer,Long> datalist=new LinkedHashMap<Integer, Long>();
			for(int i=0;i<n;i++){
				int id=sc.nextInt();
				long val=sc.nextInt()*sc.nextInt();
				if(datalist.containsKey(id)){
					Long v=datalist.get(id);
					v+=val;
				}else{
					datalist.put(id,val);
				}
			}
			boolean isset=false;
			for(Entry<Integer, Long> entry:datalist.entrySet()){
				if(entry.getValue()>=1000000){
					ln(entry.getKey());
					isset=true;
				}
			}
			if(!isset){
				ln("NA");
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}