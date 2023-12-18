    import java.util.Scanner;
     
    class Main{
    	public static void main(String arg[]) {
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		sc.nextLine();
    		String s = sc.nextLine();
    		String[]S = s.split("");
    		sc.close();
    		int min = N;
    		int count = 0;
    		int e = 0;
    		int w = 0;
    		
    		for(int i = 0; i < N; i++) {
    			if(S[i].equals("E")) {
    				count++;
    			}
    		}
    		
    		for(int i = 0; i < N; i++) {
    			e = count;
        		w = 0;
    			if(S[i].equals("E")) {
    				e--;
				}
    			for(int j = 0; j < i; j++) {
    				if(S[j].equals("W")) {
        				w++;
    				}
    				if(S[j].equals("E")) {
        				e--;
    				}
        		}
    			min = Math.min(min, w+e);
    		}
    		System.out.println(min);
    	}
    }