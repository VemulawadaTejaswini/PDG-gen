import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		ArrayList<Integer> list0 = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		int w1 = sc.nextInt();
		int v = sc.nextInt();
		list0.add(v);
		for(int i=1;i<n;i++){
			int weight = sc.nextInt();
			int value = sc.nextInt();	
			
			if(weight-w1==0)
				list0.add(value);
			if(weight-w1==1)
				list1.add(value);
			if(weight-w1==2)
				list2.add(value);
			if(weight-w1==3)
				list3.add(value);
		}

		Collections.sort(list0);
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		list0.add(0);
		list1.add(0);
		list2.add(0);
		list3.add(0);
		
		long sum = 0;
		int v0 = 0, v1 = 0, v2 = 0, v3 = 0;
		for(int i=list0.size()-1;i>=0;i--){
			v0+=list0.get(i);
			v1 = 0;
			for(int j=list1.size()-1;j>=0;j--){
				v1+=list1.get(j);
				v2 = 0;
				for(int k=list2.size()-1;k>=0;k--){
					v2+=list2.get(k);
					v3 = 0;
					for(int l=list3.size()-1;l>=0;l--){
						v3+=list3.get(l);
						if((long)w1*(list0.size()-1-i)+(long)(w1+1)*(list1.size()-1-j)+(long)(w1+2)*(list2.size()-1-k)+(long)(w1+3)*(list3.size()-1-l)<=w){
							if(v0+v1+v2+v3>sum)
								sum = v0+v1+v2+v3;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}