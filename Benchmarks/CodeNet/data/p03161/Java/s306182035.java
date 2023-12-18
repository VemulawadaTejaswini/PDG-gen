import java.util.Scanner;

import java.lang.Math;

public class Main {
	private static int n_pedras, pulo_maximo;
	private static Integer[] altura_pedras;
	private static Integer[][] custos;
	
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			n_pedras = scanner.nextInt();
		
		    pulo_maximo = scanner.nextInt();
		    
		    altura_pedras = new Integer[n_pedras + 1];
		    
		    custos = new Integer[n_pedras + 1][pulo_maximo + 1];
		    
		    for(int i = 1; i <= n_pedras; i++){
		    	altura_pedras[i] = scanner.nextInt();
		    }

		    for(int i = 1; i <= n_pedras; i++){
		        for(int j = 1; j <= pulo_maximo; j++){
		            custos[i][j] = -1;
		        }
		    }

		    int custo_minimo = path(1);

		    System.out.println(custo_minimo);
	}
	
	private static int path(int pedra){
	    if(pedra == n_pedras){
	        return 0;
	    }

	    for(int i = 1; i <= pulo_maximo; i++){
	        if(pedra + i <= n_pedras){
	            if(custos[pedra][i] == -1){
	                custos[pedra][i] = Math.abs(altura_pedras[pedra] - altura_pedras[pedra + i]) + path(pedra + i);
	            }
	        }
	    }

	    int custo_minimo = custos[pedra][1];

	    for(int i = 2; i <= pulo_maximo; i++){
	        if(pedra + i <= n_pedras){
	            custo_minimo = Math.min(custo_minimo, custos[pedra][i]);
	        }
	    }

	    return custo_minimo;
	}
}