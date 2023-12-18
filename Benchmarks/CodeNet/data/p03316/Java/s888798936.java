import java.util.*;


class Main {
    public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
   		String str=sc.next();
   		int num=0;
   		for(int i=0;i<str.length();i++){
   			num+=Character.getNumericValue(str.charAt(i));
   		}
   		if(Integer.parseInt(str)%num==0)System.out.println("Yes");
   		else System.out.println("No");
   		sc.close();
    }
}