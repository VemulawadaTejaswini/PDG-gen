import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int ans = 0;
    	int N = sc.nextInt();
    	sc.nextLine();
    	String[] ary = new String[N];
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextLine();
    	}
    	int M = sc.nextInt();
    	sc.nextLine();
    	String[] ary2 = new String[M];
    	for(int i = 0; i < M; i++){
    		ary2[i] = sc.nextLine();
    	}
    	sc.close();
    	for(int i = 0; i < N; i++){
    		int score = 0;
    		for(int j = 0; j < N; j++){
    			if(ary[i].equals(ary[j])){
    				score++;
    			}
    		}
    		for(int j = 0; j < M; j++){
    			if(ary[i].equals(ary2[j])) score--;
    		}
    		ans = Math.max(ans, score);
    	}
    	System.out.println(ans);
    }
}