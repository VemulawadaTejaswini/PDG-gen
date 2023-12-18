import java.util.*;
public class Main {
  	static int mod = 1000000007;
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int N = sc.nextInt();
    long K = sc.nextLong();
  int[] A =new int[N];
    int i =0;
    List<Integer> intList = new ArrayList<Integer>();   
	for(i=0;i<N;i++){
      A[i]=sc.nextInt();
      if(intList.indexOf(A[i])<0){
        intList.add(A[i]);
      }else{
        intList=intList.subList(0,intList.indexOf(A[i]));
      }
    }
  	for(i=0;i<N;i++){
      if(intList.indexOf(A[i])<0){
        intList.add(A[i]);
      }else{
        intList=intList.subList(0,intList.indexOf(A[i]));
      }
    }
  for(int k:intList){
    System.out.print(k+" ");
  }

  }
} 