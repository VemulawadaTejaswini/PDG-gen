import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = a;
        Long c = 0;
        Long d = 0;
		Long [] in = new Long [a];
        String [] str = new Long [a];
        for(int i=0;i<a;i++){in[i] = sc.nextLong();
                             str[i] = sc.nextLong();                             
                            }
         for(int i=0;i<a;i++){
            c = Math.max(c,in[i]+str[i]);
        d = Math.min(d,in[i]-str[i];}
         }
		System.out.println(b);
	}
}
