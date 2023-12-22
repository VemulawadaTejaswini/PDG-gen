import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
        String s = new String();
        while(in.hasNext()) s=s+in.nextLine();
        s=s.toLowerCase();
		char[] a={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char c:a){
        	int r=0;
        	for(int i=0;i<s.length();i++){
            	if(s.charAt(i)==c)r+=1; 
        	}
        	System.out.println(c+" : "+r);
        }
	}
}