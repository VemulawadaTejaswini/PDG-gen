import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		int[] array = new int[10];
		Scanner stdIn = new Scanner(System.in);

		for(int i=0;i<10;i++){
			array[i] = stdIn.nextInt();
		}

		array = arraySort(array);
		System.out.println(array[0]+"\n"+array[1]+"\n"+array[2]);
	}

	//配列を降順にソート
	public static int[] arraySort(int[] array){

		// 最後の要素を除いて、すべての要素を並べ替えます
	    for(int i=0;i<array.length-1;i++){

	    	// 下から上に順番に比較します
	    	for(int j=array.length-1;j>i;j--){

	    		// 上の方が大きいときは互いに入れ替えます
	    		if(array[j]>array[j-1]){
	    			int t=array[j];
	    			array[j]=array[j-1];
	    			array[j-1]=t;
	    		}
	    	}
	    }
		return array;
	}
}