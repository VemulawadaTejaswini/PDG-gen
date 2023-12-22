import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(scan.hasNext()){
        	char[] ch = scan.nextLine().toCharArray();
        	String ns = "";
        	for(int i = 0;i < ch.length;i++){
        		if(Character.isDigit(ch[i])){
        			ns += ch[i] + "";
        		}else if(!ns.equals("")){
        			sum += Integer.parseInt(ns);
        			ns = "";
        		}
        	}
        }
        System.out.println(sum);
    }
}