import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = sc.nextLong();
		Long [] in = new Long [a];
        for(int i=0;i<a;i++){in[i] = sc.nextLong();
                            }
        Arrays.sort(in);
		Long c = a-a;
        for(Long i=0;i<a-b;i++){c+=in[i];}      
		System.out.println(c);
	}
}
