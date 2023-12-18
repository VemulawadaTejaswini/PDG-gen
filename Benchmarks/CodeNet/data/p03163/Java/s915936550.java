package mochila;

import java.util.Scanner;

public class mochila {

	public static void main(String[] args) {
		//Lê as entradas do teclado
		Scanner sc = new Scanner(System.in);
		
	    int n = Integer.parseInt(sc.next());
	    int w = Integer.parseInt(sc.next());
	    
	    //Inicializa os parametros 
	    long[][] matriz = new long[n+1][w+1];
	    int[] p = new int[n];
	    int[] v = new int[n];
	    
	    //Inicializa a matriz com 0
	    for(int i = 0; i <= n; i++) {
	      for(int j = 0; j <= w; j++) {
	        matriz[i][j] = 0;
	      }
	    }
	    
	    //Lê as entradas de peso e valor
	    for(int i = 0; i < n; i++) {
	      p[i] = Integer.parseInt(sc.next());
	      v[i] = Integer.parseInt(sc.next());
	    }
	    
	    //Percorre a matriz buscando o valor que caiba na mochila
	    for(int i = 0; i < n; i++) {
	      for(int j = 0; j <= w; j++) {
	        matriz[i + 1][j] = matriz[i][j];
	        if(j >= p[i]) {
	          matriz[i+1][j] = Math.max(matriz[i + 1][j], matriz[i][j - p[i]] + v[i]);
	        }
	      }
	    }
	    
	    //Imprime a soma máxima possível dos valores dos itens que Taro leva para casa.
	    System.out.println(matriz[n][w]);

	}

}
