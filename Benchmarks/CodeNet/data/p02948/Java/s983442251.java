import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Work> list = new ArrayList<Work>();
		for(int i=0;i<N;i++){
            int d = sc.nextInt();
            int v = sc.nextInt();
            list.add(new Work(d,v));
        }
        Collections.sort(list);

        long ans = 0;
        int limit = M;
        // System.out.println();
        for(int i=0;i<N;i++){
            Work tg = list.get(i);
            // System.out.println(tg);
            if(tg.d <= M){
                ans+=tg.v;
                M--;
            }
        }
        System.out.println(ans);
	}
}

class Work implements Comparable{
    int d;
    int v;
    Work(int d,int v){
        this.d=d;
        this.v=v;
    }
    @Override
    public int compareTo(Object o) {
        Work one = this;
        Work two = (Work)o;
        if(one.v != two.v)return two.v-one.v;
        return two.d-one.d; 
    }

    @Override
    public String toString() {
        return d+" "+v;
    }
}