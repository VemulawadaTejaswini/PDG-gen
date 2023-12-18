
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arles
 */
public class Main {

    static int MAX_WEIGHT = 10001;//Peso maximo de la mochila
    static int MAX_N = 101; //Numero maximo de objetos
    static int N;//Numero de objetos 
    static long prices[] = new long[MAX_N];//precios de cada producto
    static int weights[] = new int[MAX_N];//pesos de cada producto
    static long memo[][] = new long[MAX_N][MAX_WEIGHT];//tabla dp

//El metodo debe llamarse con 0 en el id, y la capacidad de la mochila en w
    static long knapsack(int id, int w) {
        if (id == N || w == 0) {
            return 0;
        }
        if (memo[id][w] != -1) {
            return memo[id][w];
        }
        if (weights[id] > w) {
            memo[id][w] = knapsack(id + 1, w);
        } else {
            memo[id][w] = Math.max(knapsack(id + 1, w), prices[id] + knapsack(id + 1, w - weights[id]));
        }
        return memo[id][w];
    }
    //Antes de llamar al metodo, todos los campos de la tabla memo deben iniciarse a -1   
    
    public static void main(String[] args) throws IOException {
        int W;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        W = Integer.parseInt(line[1]);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < MAX_WEIGHT; j++) {
                memo[i][j] = -1;
            }
        }
        
        for (int i = 0; i < N; i++) {
            line = br.readLine().split(" ");
            weights[i] = Integer.parseInt(line[0]);
            prices[i] =  Long.parseLong(line[1]);
        }
        
        System.out.println(knapsack(0, W));
        
    }
}
