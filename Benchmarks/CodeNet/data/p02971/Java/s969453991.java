import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int [] in = new int [a];
		int max = 0;
        int point = -1;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                             if(max<=in[i]){max = in[i];point=i;}
                            }
        Arrays.sort(in);        		
        for(int i=0;i<a;i++){if(in[a-2]<in[a-1] && i==point)
                            {System.out.println(in[a-2]);}
                            else{System.out.println(in[a-1]);}}        
	}
}
