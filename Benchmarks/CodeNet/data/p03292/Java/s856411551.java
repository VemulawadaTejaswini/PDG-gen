import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int[] S = new int[3];
	for(int i=0;i<3;i++){
	    S[i] = stdIn.nextInt();
	}
	Arrays.sort(S);
	int j =S[2]-S[1];
	int k =S[1]-S[0];
	System.out.println(j+k);
    }
}
