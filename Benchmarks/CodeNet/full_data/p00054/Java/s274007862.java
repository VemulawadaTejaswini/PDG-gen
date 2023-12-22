import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	int n = scan.nextInt();
        	double c = (double)a / (double)b;
        	String str = String.valueOf(c);
        	int tI = 0;
        	for(int i = 0;i < str.length();i++){
        		if(str.charAt(i) == '.'){
        			tI = i;
        			break;
        		}
        	}
        	int sum = 0;
        	for(int i = 0,j = tI + 1;i < n && j < str.length();i++,j++){
        		sum += Integer.parseInt(str.charAt(j)+"");
        	}
        	System.out.println(sum);
        }
    }
}