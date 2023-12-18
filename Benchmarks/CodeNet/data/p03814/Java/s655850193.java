import java.util.Scanner;

    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String s = sc.next();
    		String tmp ="";
    		int start=0;
    		int end=0;
    		for (int i=0;i<s.length();i++) {
    			tmp=s.substring(i,i+1);
    			if(tmp.equals("A")) {
    				start=i;
    				break;
    			}
    		}
    		for(int j=s.length()-1;j>0;j--) {
    			tmp=s.substring(j,j+1);
    			if(tmp.equals("Z")) {
    				end=j;
    				break;
    			}
    		}
    		System.out.println(end-start+1);
    	}
    }