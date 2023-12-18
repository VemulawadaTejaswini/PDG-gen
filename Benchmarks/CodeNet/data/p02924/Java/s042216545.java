
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N<10^9なので、N はintに入るけど、その大体２乗であるMはintでは足りない
        int N = sc.nextInt();
        long M = (long)N * ((long)N - 1) / 2; //Nをlong型にキャストしないと、Mがintの判定で計算されるので注意
        System.out.println(M);


    }
}



