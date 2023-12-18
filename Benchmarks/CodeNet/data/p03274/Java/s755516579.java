import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static int N,K;
    static int[] arrInput;
    static int[] arrCopy;
    static Queue<Integer> qr;
    static Set<Integer> lsortSet;
    static Set<Integer> rsortSet = new TreeSet<Integer>();
    static int dis;
    static int first;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arrInput = new int[N];
		arrCopy = new int[N+1];
		qr = new LinkedList<Integer>();
		lsortSet = new TreeSet<Integer>(new Comparator<Integer>(){
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o2.compareTo(o1);//降序排列
	        }
	    });
		rsortSet = new TreeSet<Integer>();
		
		int insertIndex=0;
		for(int i=0;i<N;i++){
			arrInput[i] = sc.nextInt();
			if(0>arrInput[i]){
				insertIndex++;
			}
		}
		
		if(insertIndex==0){
			int startIndex=-1;
			for(int i=0;i<N;i++){
				if(K==0){
					break;
				}
				if(i==0){
					dis += Math.abs(0-arrInput[i]);
				}else{
					dis += Math.abs(arrInput[startIndex]-arrInput[i]);
				}
				K--;
				startIndex++;
			}
			
		}
		else if(insertIndex-1==N-1){
			int startIndex=N-1;
			for(int i=N-1;i>0;i--){
				if(K==0){
					break;
				}
				if(i==N-1){
					dis += Math.abs(0-arrInput[i]);
				}else{
					dis += Math.abs(arrInput[startIndex]-arrInput[i]);
				}
				K--;
				startIndex--;
			}
		}
		else{
			dis = countDis(insertIndex-1,0,insertIndex);
		}
		System.out.println(dis);
		System.out.println("Queue:" +qr.toString());
	}
	
	public static int countDis(int lIndex,int mIndex,int rIndex){
		first++;
		if(K==0){
			return dis;
		}
		
		if(lIndex<0){
			K--;
			dis = dis + countDis(rIndex,mIndex+1,rIndex+1);
			return dis;
		}
		
		if(rIndex > N-1){
			K++;
			int[] rArr= SetToInt(rsortSet);
			mIndex = rArr[rArr.length-1]-1;
			lIndex = rArr[0]-1;
			rIndex = rArr[0]-2;
			dis = dis + countDis(lIndex,mIndex,rIndex);
			return dis;
		}
		
		int ldis =-1;
		int rdis = -1;
		if(first==1){
			ldis = Math.abs(0-arrInput[lIndex]);
			rdis = Math.abs(0-arrInput[rIndex]);
		}else{
			ldis = Math.abs(arrInput[mIndex]-arrInput[lIndex]);
			rdis = Math.abs(arrInput[mIndex]-arrInput[rIndex]);
		}
		
		if(ldis<rdis){
			mIndex=lIndex;
			lsortSet.add(mIndex);
			K--;
			return dis+Math.min(ldis, rdis)+countDis(lIndex-1,mIndex,rIndex);
			
		}else if(ldis>rdis){
			mIndex = rIndex;
			rsortSet.add(mIndex);
			//qr.add(Math.min(ldis, rdis));
			K--;
			return dis+Math.min(ldis, rdis)+countDis(lIndex,mIndex,rIndex+1);
		}
		else{
			lsortSet.add(lIndex);
			rsortSet.add(rIndex);
			return dis+Math.min(ldis, rdis)+Math.min(countDis(lIndex-1,lIndex,rIndex), countDis(lIndex,rIndex,rIndex+1)); 
		}
	}
	// 将set集合转为整型int数组的方法
	private static int[] SetToInt(Set<Integer> allSet) {
		// 先将set集合转为Integer型数组
		Integer[] temp = allSet.toArray(new Integer[] {});//关键语句
 
		// 再将Integer型数组转为int型数组
		int[] intArray = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			intArray[i] = temp[i].intValue();
		}
		return intArray;
	}
}