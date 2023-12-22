import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	int data = 0;
	while(kbd.hasNext()){	   
	    int n = kbd.nextInt(); // 支払い金額
	    if(n!=0) { 
		if(data>0)
		    System.out.println();
		solve(n);
		data++;
	    }
	}
    }

    void solve(int n){
	int[] first = new int[4]; // 最初の持ちコイン
	int[] last = new int[4];  // 支払い後の持ちコイン
	int sum = 0; // 最初の手持ち
	for(int i=0; i<4; i++){
	    first[i] = kbd.nextInt();
	    if(i==0)
		sum += first[i]*10;
	    else if(i==1)
		sum += first[i]*50;
	    else if(i==2)
		sum += first[i]*100;
	    else if(i==3)
		sum += first[i]*500;
	}
	int change = sum-n; // おつり
	//System.out.println(sum+" "+n+" "+change);

	while(change >= 500){
	    last[3]++;
	    change -= 500;
	}
	while(change >= 100){
	    last[2]++;
	    change -= 100;
	}
	while(change >= 50){
	    last[1]++;
	    change -= 50;
	}
	while(change >= 10){
	    last[0]++;
	    change -= 10;
	}
	
	int[] ans = new int[4]; // 実際に支払うコイン
	for(int i=0; i<4; i++){
	    //System.out.println(last[i]);
	    ans[i] = first[i]-last[i];
	}

	// 出力
	for(int i=0; i<4; i++){
	    if(ans[i]>0){
		if(i==0)
		    System.out.print("10 ");
		else if(i==1)
		    System.out.print("50 ");
		else if(i==2)
		    System.out.print("100 ");
		else if(i==3)
		    System.out.print("500 ");
		System.out.println(ans[i]);
	    }
	}
    }
}