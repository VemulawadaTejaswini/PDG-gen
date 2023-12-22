import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);

    String n;
    boolean[] ans;
    int count;

    void run(){
	while(kbd.hasNext()){
	    n = kbd.next();
	    int[] num = new int[10]; // 何が何枚あるか、0は未使用
	    for(int i=0; i<n.length(); i++){
		int a = Integer.parseInt(n.substring(i, i+1));
		num[a]++;
	    }
	    ans = new boolean[10];
	    count = 0;
	    solve(num);

	    if(count!=0){
		for(int i=0; i<num.length; i++){
		    if(ans[i]) System.out.print(i+" ");
		}
	    }
	    else System.out.print("0");
	    System.out.println();
	}
    }

    void solve(int[] num){
	/*
	  牌の追加の仕方は9通りなので、全パターン試す
	*/
	for(int k=1; k<10; k++){
	    int[] n = Arrays.copyOf(num, 10);
	    n[k] += 1;
	    /*
	      もし追加したのが5枚目だったら、なかったことにして次へ
	      そうでなければ、成り立っているか確かめる
	    */
	    if(n[k]<5){
		/*
		System.out.println("--- k = "+k+" ---");
		for(int i=0; i<n.length; i++){
		    System.out.println(i+" : "+n[i]);
		}
		*/
		check(n, 0, k, false);
		if(ans[k]) count++;
	    }
	    n[k] -= 1;
	}
    }

    void check(int[] num, int level, int k, boolean f){
	if(level >= num.length){ // 完成の時
	    boolean tf = true;
	    for(int i=0; i<num.length; i++)
		tf = tf && num[i]==0;
	    if(tf) ans[k] = true;
	    return;
	}
	else{ 
	    boolean flag = false;

	    // 1. 刻子ケース
	    if(num[level]>=3){
		flag = true;
		num[level] -= 3;
		if(num[level]==0)
		    check(num, level+1, k, f);
		else
		    check(num, level, k, f);
	    }
	    if(flag){
		num[level] += 3;
		flag = false;
	    }

	    // 2. 雀頭ケース
	    if(num[level]>=2 && !f){
		flag = true;
		f = true;
		num[level] -= 2;
		if(num[level]==0)
		    check(num, level+1, k, f);
		else
		    check(num, level, k, f);
	    }
	    if(flag){
		num[level] += 2;
		flag = false;
	    }

	    // 3. 順子ケース
	    if(level+2<num.length && num[level]>=1 &&
	       num[level+1]>=1 && num[level+2]>=1){
		flag = true;
		num[level] -= 1;
		num[level+1] -= 1;
		num[level+2] -= 1;
		if(num[level]==0)
		    check(num, level+1, k, f);
		else
		    check(num, level, k, f);
	    }
	    if(flag){
		num[level] += 1;
		num[level+1] += 1;
		num[level+2] += 1;
		flag = false;
	    }	

	    check(num, level+1, k, f);
	}
    }
}