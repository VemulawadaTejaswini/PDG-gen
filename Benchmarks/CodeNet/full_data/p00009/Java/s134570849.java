package sosuu;

import java.util.*;

public class Main {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		while(true){
			try{
				a.add(scn.nextInt());
			}catch(Exception e){
				break;
			}
		}
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		for (int test: a){		
			for(int i=2;test>i;i++){
				for(int k=2;i>k;k++){
					if(i%k==0){
						flag = false;
						break;
					}else{
						flag = true;
					}
				}
				if(flag){
					list.add(i);
				}
			}
			System.out.print(list.size());
		}
	}

}