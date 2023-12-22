import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i]= Integer.parseInt(s[i]);
		}
		
		int n2 = Integer.parseInt(sc2.nextLine());
		String[] s2 = sc2.nextLine().split("[\\s]+");
		String[] s3 = new String[s2.length-1];
		if(s2[0].equals("")){
			for(int i=0;i<s2.length-1;i++){
				s3[i] = s2[i+1];
			}
		}else{s2 = s3;}
		
		int[] x2 = new int[n+1];
		for(int i=0;i<n2;i++){
			x2[i]= Integer.parseInt(s3[i]);
		}
		
		for(int h=0;h<n;h++){
			for(int g=0;g<n2;g++){
				if(x[h] == x2[g]) count++;
			}
		}
		System.out.println(count);
		
	}
}