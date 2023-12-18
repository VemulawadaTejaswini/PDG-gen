import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int k = sc.nextInt();
		//三つの数取得
    	ArrayList<Integer> list = new ArrayList<>();
		//空のlist作成
    
    	if(a<=k && k<=b){
      		for(int i=0; i<k; i++){
        	list.add(a);
        	a++;
        	list.add(b);
        	b--;
      	}
    	}else{
        	for(int j=a; j<=b; j++){
          	list.add(j);
        	}
    	}
		//Aに1からKまで足した数をすべてlistに追加
		//Bに1からKまで引いた数をすべてlistに追加

		ArrayList<Integer> result = new ArrayList<Integer>(new HashSet<>(list));
		//listをhashmapにして重複削除
    	for(k=0; k<list.size(); k++){
      		System.out.println(result.get(k));
    	}
		//listの出力
    }
}