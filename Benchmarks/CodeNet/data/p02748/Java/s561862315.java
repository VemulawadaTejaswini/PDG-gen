import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = sc.nextInt();
		int m = sc.nextInt();
        int [] ina = new int [a];
        int [] inb = new int [b];
		int [] inm1 = new int [m];
        int [] inm2 = new int [m];
        int [] inm3 = new int [m];
        int [] inm4 = new int [m];
        int ans = 0;
        for(int i=0;i<a;i++){
                             ina[i] = sc.nextInt();
                            }
		for(int i=0;i<b;i++){
                             inb[i] = sc.nextInt();
                            }
        for(int i=0;i<m;i++){
                             inm1[i] = sc.nextInt();
                             inm2[i] = sc.nextInt();
                             inm3[i] = sc.nextInt();
                            }
        for(int i=0;i<m;i++){inm4[i] = ina[inm1[i]]+inb[inm2[i]]-inm3[i];}
        Arrays.sort(ina);
        Arrays.sort(inb);
        Arrays.sort(inm4);
        ans = Math.min(ina[0]+inb[0],inm4[0]);
		System.out.println(ans);
	}
}
