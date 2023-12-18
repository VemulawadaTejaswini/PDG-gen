import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		TreeSet<Long> lia = new TreeSet<Long>();
		long iia = 0;
		for(int i=0;i<iin;i++){
			iia = sc.nextLong();
			if(lia.size()==0){
				lia.add(iia);
			}
			else{
				if(!lia.remove(iia)){
					lia.add(iia);
				}
			}
		}
		System.out.println(lia.size());
    }
}
