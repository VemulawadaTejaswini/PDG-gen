import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s=sc.nextLine();   
    	char CA[] = s.toCharArray(); 
    	int a[]=new int[26];
    	for(int i=0;i<s.length();i++){
    		for(int j=0;j<26;j++){
    			if(CA[i]==j+97||CA[i]==j+65){
    			a[j]++;break;
    		}
    	}
    }
    	for(int j=0;j<26;j++)System.out.println(s=(char)(j+97)+" : "+a[j]);
    }
}