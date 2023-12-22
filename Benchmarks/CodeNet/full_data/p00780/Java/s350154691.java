import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int max = (int)(Math.pow(2,15));
		int count=0;
		List<Integer> list = new ArrayList<Integer>(); 
		boolean[] a = new boolean[max];
		for(int i=0;i<max;i++){
			a[i] = true;
		}
		a[0]=false;
		a[1]=false;
		for(int i=2;i<max;i++){
			for(int j=2;i*j<max;j++){
				if(i*j < max) a[i*j] = false;
			}
		}
		for(int i=0;i<max;i++){
			if(a[i] == true){
				list.add(i);			
			}
		}
		//System.out.print(list);
		while(scan.hasNext()){
			int num = scan.nextInt(); 
			for(int j=0;j<list.size();j++){
				for(int k=0;k<list.size();k++){
					int first = list.get(j).intValue();
					int second = list.get(k).intValue();
					//System.out.println(first);
					if(first+second == num && first<=second) count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}