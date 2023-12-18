import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] st = new int[N];
		for(int i=0;i<N;i++) {
			st[i] = scan.nextInt();
		}
		int[] path = new int[N];
		path[0] = 0;
		path[1] = Math.abs(st[1]-st[0]);
		//En caso de que el arreglo solo tenga dos piedras se devuelve la diferencia absoluta entre estas dos, en caso
		//de tener mas de dos piedras se evalua la distancia mas corta para cada piedra empezando desde la mas cercana 
		//al inicio, se emplea el paradigma de greedy algorithms en la medida de que se busca cada sub-solucion mas 
		//eficiente y la DP ya que cada una de estas soluciones se conserva.
		if(N==2) {
			
		}else {
			
	    for(int i=2;i<N;i++) {
	    	path[i] = Math.min(path[i-2]+Math.abs(st[i]-st[i-2]), 
	    			path[i-1]+Math.abs(st[i]-st[i-1]));
	    	
	    }
		}
		 System.out.println(path[N-1]);
		scan.close(); 	
		}
		     
	    }
	
