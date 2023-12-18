import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		ArrayList<Long> lia = new ArrayList<Long>();
		long iia = 0;
		for(int i=0;i<iin;i++){
			iia = sc.nextLong();
			int idx = lia.indexOf(iia);
			if(idx==-1){
				lia.add(iia);
			}
			else{
				lia.remove(idx);
			}
		}
		System.out.println(lia.size());
    }
}
