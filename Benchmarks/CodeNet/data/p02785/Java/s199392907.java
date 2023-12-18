import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		Long [] in = new int [a];
        for(int i=0;i<a;i++){in[i] = sc.nextInt();
                            }
        Arrays.sort(in);
		Long c = 0;
        for(int i=0;i<a-b;i++){c+=in[i];}      
		System.out.println(c);
	}
}
