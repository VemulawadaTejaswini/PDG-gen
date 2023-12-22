import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
      int count=0;
	Scanner sc = new Scanner(System.in);
String abc="abcdefghijklmnopqrstuvwxyz";
	String ans=sc.next();
	ans=ans.toLowerCase();
	for(int i=0;i<abc.length();i++){
	for(int j=0;j<ans.length();j++){
	if(abc.charAt(i)==ans.charAt(j)){count++;}
	}
	System.out.printf(" %c : %d\n",abc.charAt(i),count);
	count=0;
	}



}
}