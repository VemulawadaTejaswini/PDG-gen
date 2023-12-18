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
    		
    		for(int i = 1; i < N; i++) {
    			if(S[i].equals("E")) {
    				count++;
    			}
    		}
    		
    		for(int i = 1; i < N; i++) {
				if(S[i-1].equals("W")) {
    				count++;
				}
				if(S[i].equals("E")) {
    				count--;
				}
    			min = Math.min(min, count);
    		}
    		System.out.println(min);
    	}
    }