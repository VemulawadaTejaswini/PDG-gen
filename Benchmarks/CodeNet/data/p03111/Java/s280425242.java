import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] abc = new int[3];
    	for(int i = 0; i < 3; i++){
    		abc[i] = sc.nextInt();
    	}
//    	System.out.println(Arrays.toString(abc));
    	sc.nextLine();
    	int[] ary = new int[N];
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextInt();
    	}
    	sc.close();
    	Arrays.sort(ary);
    	int ok = 0;
    	int mp = 0;
    	for(int i = 2; i >= 0; i++){
    		for(int j = 0; j < N; j++){
    			if(j != -1){
    				if(abc[i] == ary[j]){
        				ary[j] = -1;
        				ok++;
        				break;
        			}else{
        				for(int k = 0; k < N; i++){
        					if(j != k && k > -1 && abc[i] == ary[j] + ary[k]){
        						ary[j] = -1;
        						ary[k] = -1;
        						mp += 20;
        						ok++;
        					}
        				}
        			}
    			}
    		}
    		if(ok == 3) break;
    	}
    	System.out.println(mp);
    }
}