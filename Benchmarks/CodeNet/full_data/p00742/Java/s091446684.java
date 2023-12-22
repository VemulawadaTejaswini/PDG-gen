import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static ArrayList<Character> notZeroChar;
	static ArrayList<Integer> notZeroIndex;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			notZeroChar=new ArrayList<Character>();
			notZeroIndex=new ArrayList<Integer>();
			int N=sc.nextInt();
			if(N==0)return;
			HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
			String temp_str;
			for(int i=0;i<N;i++){
				temp_str=sc.next();
				char ini=temp_str.charAt(0);
				if(temp_str.length()!=1&&!notZeroChar.contains(ini)){
					notZeroChar.add(ini);
				}
				hm= initialize(hm,temp_str,i,N-1);
			}
			int variety = hm.size();
			int[] al=new int[variety];
			int i=0;
			for(char x:hm.keySet()){
				al[i] = hm.get(x);
				if(notZeroChar.contains(x))notZeroIndex.add(i);
				i++;
			}
			List<Integer> fillList = new LinkedList<Integer>();
			int result = rep(0,al,fillList,0,variety);
			System.out.println(result);
		}
	}
	private static int rep(int result,int[] al,List<Integer> fillList,int index,int variety){
		int count=0;
		for(int x=0;x<=9;x++){//counter++;
			if(!(notZeroIndex.contains(index)&&x==0)){
				if(!fillList.contains(x)){
					result+=al[index]*x;
					if(index==variety-1){
						if(result==0) {
							count+=1;
							result-=al[index]*x;
							break;
							}
						result-=al[index]*x;
					}else{
						index++;
						fillList.add(x);
						count+=rep(result,al,fillList,index,variety);
						index--;
						result-=al[index]*x;
					}
				}
			}
		}
		if(index!=0){
			index--;
			fillList.remove(fillList.size()-1);
		}
		return count;
	}

	private static HashMap<Character,Integer> initialize(HashMap<Character,Integer>hm,String temp_str,int i,int end){
		int l=temp_str.length();
		double k = 1.0;
		if(i==end) k = -1.0;
		for(int j=0;j<l;j++){
			if(hm.containsKey(temp_str.charAt(j))){
				hm.put(temp_str.charAt(j), (int) (k*Math.pow(10, l-j-1))+hm.get(temp_str.charAt(j)));
			}else{
				hm.put(temp_str.charAt(j), (int) (k*Math.pow(10, l-j-1)));
			}
		}
		return hm;
	}
}