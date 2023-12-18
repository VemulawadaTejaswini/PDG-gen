import java.util.*;

class Sushi{
    public int t;
    public long d;
    public long point;
    public Sushi(int t1, long d1){
	t = t1;
	d = d1;
    }
}

public class Main {
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();

	//long t[n];
	//long d[n];
	int t;
	long d;
	Sushi[] s = new Sushi[n];

	for(int i = 0; i < n; i++){
	    t = sc.nextInt();
	    d = sc.nextLong();
	    s[i] = new Sushi(t, d);
	}

	// おいしさ順にソートする
	//Arrays.sort(s, comparing(x -> x.d), reverseOrder());
	//Arrays.sort(s, (a,b) -> b.d - a.d);
	Arrays.sort(s, (a,b) -> a.d > b.d ? -1 : 1);

	// degug
	//System.out.println("");
	//for(int i = 0; i < n; i++){
	//System.out.println(s[i].t + " " + s[i].d);
	//}

	long[] ate = new long[n+1];
	int atekind = 0;
	long ans = 0;
	Sushi[] notFirst = new Sushi[n];
	int notFirst_index = 0;
	for(int i = 0; i < k; i++){
	    ans += s[i].d;
	    if(ate[s[i].t] == 0){
		ate[s[i].t] = 1;
		atekind ++;
	    }else{
		notFirst[notFirst_index] = s[i];
		notFirst_index++;
	    }
	}
	ans += atekind * atekind;

	long ans1 = ans;
	for(int i = k; i < n && notFirst_index > 0; i++){
	    if(ate[s[i].t] == 0){
		ate[s[i].t] = 1;
		atekind ++;
		notFirst_index--;
		ans1 += s[i].d + atekind * atekind - (atekind -1) * (atekind -1) - notFirst[notFirst_index].d;
		//System.out.println(s[i].t + " " + s[i].d + " " + ans + " " + ans1);
		if(ans1 > ans){
		    ans = ans1;
		}
	    }
	}

	System.out.println(ans);
    }

}


