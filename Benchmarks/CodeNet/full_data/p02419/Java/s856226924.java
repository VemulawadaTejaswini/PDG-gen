import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String W=" "+in.nextLine()+" ";
        String T="";
        String n=in.nextLine();
        while(!n.equals("END_OF_TEXT")){
        	T+=" "+n.toLowerCase().replace(" ", "  ")+" ";
        	n=in.nextLine();
        }
        int c=0;
        int i=-1;
        int l=W.length();
        while(true){
            i=T.indexOf(W, i+1);
            if(i==-1){
            	break;
            }else{
            	c++;
            	i+=l-1;
            }
        }
        System.out.println(c);
	}
}