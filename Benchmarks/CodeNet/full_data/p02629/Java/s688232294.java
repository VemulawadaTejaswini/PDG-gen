import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String alp[] = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<Integer> x = new ArrayList<Integer>();

        if(n>26 && n>703) {
        do {
        	x.add((int) (n%26));
        	n = n/26;
        }while(n/26>26) ;
        n = n/26;
        x.add((int) (n%26));
        x.add((int) (n));
        for(int i=x.size()-1;0<=i;i--) {
        	System.out.print(alp[x.get(i)-1]);
        }
        }else if(n<=26){
        	System.out.print(alp[(int) (n-1)]);
        }else if(26<n && n<703) {
        	x.add((int) (n%26));
        	n=n/26;
            x.add((int) (n));
            for(int i=x.size()-1;0<=i;i--) {
            	System.out.print(alp[(int) (n-1)]);
            }
        }
    }
}