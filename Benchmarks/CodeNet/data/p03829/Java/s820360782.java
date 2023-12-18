import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();//walk
        int B = sc.nextInt();//teleport
        //the best way: ascending order
        int[] town = new int[N];
        for(int i=0;i<N;i++)town[i]= sc.nextInt();
        int tired = 0;
        for(int i=0;i<N-1;i++){
        	int distance = town[i+1] - town[i];
        	tired += Math.min(distance*A,B);
        }
        System.out.println(tired);
    }
}