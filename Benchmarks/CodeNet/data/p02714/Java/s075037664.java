import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str;
    str = sc.next();
    char[] s = str.toCharArray();
    int pair = 0;
    for(int k=2;k<n;k++){
      for(int j=1;j<k;j++){
	if(s[j]==s[k])
	    continue;
        for(int i=0;i<j;i++){
	  if(k-j==j-i)
            continue;
	  if(s[i]==s[j])
	    continue;
	  if(s[i]==s[k])
	    continue;
          pair++;
        }
      }
    }
    System.out.println(pair);
  }
}