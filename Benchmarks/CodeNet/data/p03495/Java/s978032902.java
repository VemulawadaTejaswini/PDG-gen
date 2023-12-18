import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
        int iik = sc.nextInt();
		int iis = 0;
		int irt = 0;
		TreeMap<Integer,Integer> ihm = new TreeMap<Integer,Integer>();
		for(int i=0;i<iin;i++){
			iis = sc.nextInt();
			if(ihm.containsKey(iis)){
				int iat = ihm.get(iis);
				iat++;
				ihm.put(iis, iat);
			}
			else{
				ihm.put(iis, 1);
			}
		}
		
        for(int i=ihm.size();i>iik;i--){
            int j=1;
            for(;;j++){
                if(ihm.containsValue(j)){
                    break;
                }
            }
            for(int k=ihm.firstKey();;k=ihm.higherKey(k)){
                int ike = ihm.get(k);
                if(j==ike){
                    irt += ihm.remove(k);
                    break;
                }
            }
        }
        System.out.println(irt);
    }
}
