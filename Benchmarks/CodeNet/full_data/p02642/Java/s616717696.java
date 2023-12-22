import java.util.Scanner;
import java.util.HashSet;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> a = new HashSet<>();
	HashSet<Integer> doubleList = new HashSet<>();
	int n = sc.nextInt();
	int maxValue = 0;
	for(int i=0;i<n;i++){
	    boolean addable = true;
	    int x = sc.nextInt();
	    if(maxValue<x){
		maxValue = x;
	    }
	    if(x==1&&a.contains(1)){
		a.remove(1);
		doubleList.add(1);
	    }
	    if(a.contains(1)||doubleList.contains(1)){
		continue;
	    }
	    if(x==0){
		for(int j=0;j<maxValue;j++){
		    if(a.contains(j)){
			a.remove(j);
		    }
		}
		continue;
	    }
	    //xがリストにあったらdoubleListに登録
	    if((a.contains(x)||doubleList.contains(x))){
		doubleList.add(x);
		addable = false;
		a.remove(x);
		continue;
	    }
	    for(int j=2;j<x;j++){
		//因数がリストにあったら追加しない
		if(x%j==0){
		    if(a.contains(j)){
			addable = false;
			break;
		    }
		}
	    }
	    //因数がListになければListに追加
	    if(addable){
		a.add(x);
	    }
	    //xを因数とする数値の削除
	    for(int j=2;x*j<=maxValue;j++){
		if(a.contains(j*x)){
		    a.remove(j*x);
		    if(doubleList.contains(j*x)){
			doubleList.remove(j*x);
		    }
		}
	    }
	}
	System.out.println(a.size());
	sc.close();
      }
}
