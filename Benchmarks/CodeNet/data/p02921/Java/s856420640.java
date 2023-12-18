import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	String S = sc.next();

	String T = sc.next();

	char[] s = new char[3];

	char[] t = new char[3];

	for(int i=0; i<3; i++){

	s[i] = S.charAt(i);
	
	t[i] = T.charAt(i);

  }	

	int ans = 0;

	for(int i=0; i<3; i++){

	if(s[i]==t[i]){

	ans++;

   }
  }	

 }
}