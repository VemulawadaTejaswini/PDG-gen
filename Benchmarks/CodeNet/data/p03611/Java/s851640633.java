import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iis = 0;
		int iism = 0;
		int iimm = 0;
		int irt = 0;
		TreeMap<Integer,Integer> ihm = new TreeMap<Integer,Integer>();
		for(int i=0;i<iin;i++){
			iis = sc.nextInt();
			if(iis<iism || i==0){
				iism = iis;
			}
			if(iis>iimm || i==0){
				iimm = iis;
			}
			if(ihm.containsKey(iis)){
				int iat = ihm.get(iis);
				iat++;
				ihm.put(iis, iat);
			}
			else{
				ihm.put(iis, 1);
			}
		}
		for(int i=iism;i<=iimm;i++){
			iis = 0;
			if(ihm.containsKey(i-1)){
				iis += ihm.get(i-1);
			}
			if(ihm.containsKey(i)){
				iis += ihm.get(i);
			}
			if(ihm.containsKey(i+1)){
				iis += ihm.get(i+1);
				iism = i + 1;
			}
			if(irt<iis){
				irt = iis;
			}
			else if(iis==0){
				i = ihm.higherKey(i) - 1;
			}
		}
		System.out.println(irt);
    }
}
