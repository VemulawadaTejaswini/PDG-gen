import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mondai = sc.nextInt();
		int teisyutu = sc.nextInt();
		int seitou = 0;
		int pena = 0;
		if (teisyutu == 0){
			System.out.print(0);
			return;
		}
        int num = 0;
        Map<Integer, Integer> clear = new HashMap<Integer, Integer>();
		for (int i = 1; i <= teisyutu; i++) {
          	int tako = sc.nextInt();
          	if (!clear.containsKey(tako)){
              	if (num != tako){
                	pena = 0;
                }
              	num = tako;
				String kai = sc.next();
              	if (kai.equals("AC")){
                	clear.put(num, pena);
                  	pena = 0;
                  	continue;
                }else{
                    pena++;
                  	continue;
                }
            }else{
            	pena = 0;
            }
          	String hoge = sc.next();
		}
      	pena = 0;
		for (Integer hoge : clear.values()){
        	pena += hoge;
        }
      	System.out.println(clear.size() + " " + pena);
      
	}
}
