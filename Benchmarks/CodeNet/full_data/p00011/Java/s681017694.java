import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int c;
	int w = sc.nextInt();
	int n = sc.nextInt();
	int[] line;
	line = new int[w];
	for(int i=0;i<w;i++) line[i] = i+1;
	for(int i=0;i<n;i++){
	    String s = sc.next();
	    int a = Integer.parseInt(String.valueOf(s.charAt(0)));
	    int b = Integer.parseInt(String.valueOf(s.charAt(2)));
	    c = line[a-1];
	    line[a-1] = line[b-1];
	    line[b-1] = c;
	}
	for(int i=0;i<w;i++) System.out.println(line[i]);
    }
}