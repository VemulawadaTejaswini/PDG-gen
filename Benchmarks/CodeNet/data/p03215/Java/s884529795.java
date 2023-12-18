import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[]a = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++) {
        	a[i] = sc.nextInt();
        	sum += (i+1);
        }
        sc.close();
        //System.out.println(sum);
        int[][] array = new int[sum][N+1];
        int index = 0;
        int max = 0;
        for(int j=0; j<N; j++) {//1,2,3,4
        	max = N-j; //4,3,2,1
        	//System.out.println(max);
        	for(int i=1; i<=max; i++) { //1,2,3,4 1,2,3 1,2 1
        		int total = 0;
        		for(int k=1; k<=i; k++) {
        			array[index][k] = a[j+k-1];
        			total += array[index][k];
        		}
        		array[index][0] = total;
            	index++;
            	//System.out.println("");
        	}
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int min = array[0][0];
        list.add(array[0][0]);
        for(int j=0; j<sum; j++) {
        	if(array[j][0]>min ) {
        		for(int i = 0; i<K; i++) {
        			if(list.get(i) < array[j][0]) {
        				list.add(i, array[j][0]);
        				break;
        			}
        		}
        	}
        }
        int answer = list.get(0) & list.get(1); 
        for(int i = 0; i<K; i++) {
        	answer = answer & list.get(0);
        }
        System.out.println(answer);
    }
}