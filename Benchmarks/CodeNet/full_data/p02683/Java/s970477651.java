import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int x = sc.nextInt();
    	Map<Integer,Rikaido> map = new HashMap<>();
    	map.put(0,new Rikaido(m));
    	int base = 1;
    	int minCost = Integer.MAX_VALUE;
    	for(int i = 0; i < n; i++) {
    		int c = sc.nextInt();
    		int a[] = new int[m];
    		for(int j = 0; j < m; j++) {
    			a[j] = sc.nextInt();
    		}
    		for(int j = 0; j < base; j++){
    			if(map.containsKey(j)){
    				Rikaido rikaido = new Rikaido(map.get(j), a, x, c);
    				if(!rikaido.isOver){
    					map.put(base + j, rikaido);
    				}else{
    					minCost = minCost < rikaido.cost ? minCost : rikaido.cost;
    				}
    			}
    		}
    		base = base * 2;
    	}
    	if(minCost == Integer.MAX_VALUE){
    		minCost = -1;
    	}
    	System.out.println(minCost);
    }
}

class Rikaido{

	int[] rikaido;
	int cost;
	boolean isOver;
	Rikaido(int m){
		rikaido = new int[m];
	}
	Rikaido(Rikaido r, int[] a2, int x, int c){
		int[] a1 = r.rikaido;
		rikaido = new int[a1.length];
		isOver = true;
		for(int i = 0; i < a1.length; i++){
			rikaido[i] = a1[i] + a2[i];
			isOver = isOver && x <= rikaido[i];
		}
		cost = r.cost + c;
	}
}