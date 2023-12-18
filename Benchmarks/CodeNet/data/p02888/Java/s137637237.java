import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i = 0 ; i < n ; i++ ) l[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(l);
        long ebi = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                for(int k = 0 ; k < j ; k++){
                    if(l[k] + l[j] > l[i]) ebi++;
                }
            }
		}
		ou.print(ebi + "\n");
		ou.flush();
    }
}