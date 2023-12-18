import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	Integer[] array = new Integer[N];
      	for(int i=0;i<N;i++){
        	array[i] = sc.nextInt();
        }
      	Arrays.sort(array, Comparator.reverseOrder());
      	array[0] /= 2;
      	int sum = 0;
      	for(int i=0;i<N;i++){
        	sum += array[i];
        }
        System.out.println(sum);
    }
}