import java.util.Scanner;
class Main{
	public static void main(String artgs[]){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
      	String[] strlist = S.split("");
        String ns = "";
        for(int n = 0;n < N;n++){
        	if(strlist[n].equals(strlist[K-1]) == false){
            	strlist[n] = "*";  
                ns = ns + strlist[n];
            }else {
            	ns = ns + strlist[n];
            }
        }
      	System.out.println(ns);
    }  
}