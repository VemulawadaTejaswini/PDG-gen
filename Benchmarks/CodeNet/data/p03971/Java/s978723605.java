import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
        int n, a, b;
        n = cin.nextInt();
        a = cin.nextInt();
        b = cin.nextInt();
        char[] students = null;
        cin.nextLine();
        if(cin.hasNextLine()){
        	String s = cin.nextLine();
        	students = s.toCharArray();
        }
        int sum = a + b;
        for(char s : students){
        	switch(s){
        	case 'c':System.out.println("No");break;
        	case 'b':
        		if(b > 0){
        			b--;
        			sum--;
        			System.out.println("Yes");
        		}
        		else{
        			System.out.println("No");
        		}
        		break;
        	case 'a':
        		if(sum > 0){
        			sum--;
        			System.out.println("Yes");
        		}
        		else{
        			System.out.println("No");
        		}
        		break;
        	default:break;
        	}
        }
    }
}