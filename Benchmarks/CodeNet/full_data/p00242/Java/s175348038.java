//Volume2-0242
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ward implements Comparable<Ward>{
	public String s;
	public int    cnt = 1;

	Ward(String s){
		this.s = s;
	}

	public int compareTo(Ward w){
		int ret;
		ret = w.cnt - this.cnt;
		if(ret == 0){
			ret = this.s.compareTo(w.s);
		}
		return ret;
	}

	public boolean equals(Object obj){
		Ward w = (Ward)obj;
		return this.s.equals(w.s);
	}
}

public class Main {

	public static void main(String[] args){

		//declare
		final int END = 0;

		ArrayList<Ward>  in  = new ArrayList<Ward>();
		Ward     wrd;
		int      n,idx,max;
		String   ward,k;
		String[] s;

		//input
        Scanner sc = new Scanner(System.in);
        while(true){
            n = Integer.parseInt(sc.nextLine());
            if(n==END){break;}
            in.clear();
            while(n-- > 0){
            	s = sc.nextLine().split("\\s");
            	for(int i=0;i<s.length;i++){
            		wrd = new Ward(s[i]);
            		if((idx = in.indexOf(wrd)) != -1){
            			in.get(idx).cnt++;
            		} else {
            			in.add(wrd);
            		}
            	}
            }
            k = sc.nextLine();

            Collections.sort(in);

            max = 0;
            for(int i=0;i<in.size() && max<5;i++){
            	ward = in.get(i).s;
            	if(ward.startsWith(k)){
            		if(max>0){
            			System.out.print(" ");
            		}
            		System.out.print(ward);
            		max++;
            	}
            }
            if(max == 0){
            	System.out.print("NA");
            }
            System.out.println();
        }
	}
}