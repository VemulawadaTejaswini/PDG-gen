import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     String line=sc.next();
     StringBuffer s= new StringBuffer(line);
     int n=sc.nextInt();
     for(int i=0; i<n; i++){
    	 String ord=sc.next();
    	 if(ord.equals("print")){
    		 int a=sc.nextInt();
    		 int b=sc.nextInt();
    		 System.out.println(line.substring(a, b+1));
    	 }else if(ord.equals("reverse")){
    		 int a=sc.nextInt();
    		 int b=sc.nextInt();
    		 StringBuffer temp=new StringBuffer(s.substring(a, b+1));
    		 temp.reverse();
    		 s.delete(a, b+1);
    		 s.insert(a, temp);
    		 line=s.toString();


    	 }else if(ord.equals("replace")){
    		 int a=sc.nextInt();
    		 int b=sc.nextInt();
    		 String temp=sc.next();
    		 s.replace(a, b+1, temp);
    		 line=s.toString();


    	 }
     }

    }
}
