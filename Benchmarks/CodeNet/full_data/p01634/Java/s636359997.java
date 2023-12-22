import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=0, u=0, count=0, num=0;
        String s=sc.next();
        if(s.length()>=6)	count++;
        for(int i=0; i<s.length(); i++) {
        	if(Character.isUpperCase(s.charAt(i)))
        		u++;
        	if(Character.isLowerCase(s.charAt(i)))
        		l++;
        	if(s.charAt(i)== '0'|| s.charAt(i)== '1'||s.charAt(i)== '2'||s.charAt(i)== '3'||s.charAt(i)== '4'||s.charAt(i)== '5'||s.charAt(i)== '6'||s.charAt(i)== '7'||s.charAt(i)== '8'||s.charAt(i)== '9')
        		num++;
        }
        if(l==0 || u==0 || count==0 || num==0)
         System.out.println("INVALID");
        else
        	System.out.println("VALID");
    }
}
