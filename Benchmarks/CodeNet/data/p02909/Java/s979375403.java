import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String  S = stdIn.next();
	String[] W = {"Sunny","Cloudly","Rainy"};
	for(int i=0;i<W.length;i++){
	    if(S.equals(W[i])){
		int j =(i+1)%3;
		System.out.println(W[j]);
	    }
	}
    }
}
			
