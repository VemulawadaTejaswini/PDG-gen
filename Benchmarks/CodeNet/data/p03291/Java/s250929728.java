import java.util.*;

public class Main{
public static void main(String[] args){
long mod = 1000000007;
Scanner sc = new Scanner(System.in);
String S = sc.next();
int l = S.length();
long[] A = new long[l+1];
long[] AB = new long[l+1];
long[] ABC = new long[l+1];
A[0] = 0;
AB[0] = 0;
ABC[0] = 0;
for(int i=1; i<=l; i++){
switch(S.charAt(i-1)){
case 'A': A[i]=A[i-1]+1; AB[i]=AB[i-1]; ABC[i]=ABC[i-1]; break;
case 'B': A[i]=A[i-1]; AB[i]=AB[i-1]+A[i-1]; ABC[i]=ABC[i-1]; break;
case 'C': A[i]=A[i-1]; AB[i]=AB[i-1]; ABC[i]=ABC[i-1]+AB[i-1]; break;
case '?': A[i]=A[i-1]+1; AB[i]=AB[i-1]+A[i-1]; ABC[i]=ABC[i-1]+AB[i-1]; break;
}
A[i]%=mod; AB[i]%=mod; ABC[i]%=mod;
}
System.out.println(ABC[l]);
return;
}
}
